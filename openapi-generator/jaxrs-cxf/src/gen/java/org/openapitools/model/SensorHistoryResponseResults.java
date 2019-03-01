package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorHistoryResponseResults  {
  
  @ApiModelProperty(value = "List of datapoints, one for each requested (sensor, field) pair.")
 /**
   * List of datapoints, one for each requested (sensor, field) pair.
  **/
  private List<Long> series = null;

  @ApiModelProperty(example = "1453449599999", value = "Timestamp in UNIX milliseconds.")
 /**
   * Timestamp in UNIX milliseconds.
  **/
  private Integer timeMs;
 /**
   * List of datapoints, one for each requested (sensor, field) pair.
   * @return series
  **/
  @JsonProperty("series")
  public List<Long> getSeries() {
    return series;
  }

  public void setSeries(List<Long> series) {
    this.series = series;
  }

  public SensorHistoryResponseResults series(List<Long> series) {
    this.series = series;
    return this;
  }

  public SensorHistoryResponseResults addSeriesItem(Long seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

 /**
   * Timestamp in UNIX milliseconds.
   * @return timeMs
  **/
  @JsonProperty("timeMs")
  public Integer getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Integer timeMs) {
    this.timeMs = timeMs;
  }

  public SensorHistoryResponseResults timeMs(Integer timeMs) {
    this.timeMs = timeMs;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

