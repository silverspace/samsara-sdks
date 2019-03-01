package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SensorHistoryResponseResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class SensorHistoryResponseResults   {
  @JsonProperty("series")
  private List<Long> series = null;

  @JsonProperty("timeMs")
  private Integer timeMs;

  public SensorHistoryResponseResults series(List<Long> series) {
    this.series = series;
    return this;
  }

  public SensorHistoryResponseResults addSeriesItem(Long seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<Long>();
    }
    this.series.add(seriesItem);
    return this;
  }

   /**
   * List of datapoints, one for each requested (sensor, field) pair.
   * @return series
  **/
  @ApiModelProperty(value = "List of datapoints, one for each requested (sensor, field) pair.")
  public List<Long> getSeries() {
    return series;
  }

  public void setSeries(List<Long> series) {
    this.series = series;
  }

  public SensorHistoryResponseResults timeMs(Integer timeMs) {
    this.timeMs = timeMs;
    return this;
  }

   /**
   * Timestamp in UNIX milliseconds.
   * @return timeMs
  **/
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in UNIX milliseconds.")
  public Integer getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Integer timeMs) {
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
    SensorHistoryResponseResults sensorHistoryResponseResults = (SensorHistoryResponseResults) o;
    return Objects.equals(this.series, sensorHistoryResponseResults.series) &&
        Objects.equals(this.timeMs, sensorHistoryResponseResults.timeMs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

