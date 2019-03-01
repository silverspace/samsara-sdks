package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.SensorHistoryResponseResults;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.")

public class SensorHistoryResponse   {
  
  private @Valid List<SensorHistoryResponseResults> results = new ArrayList<SensorHistoryResponseResults>();

  /**
   **/
  public SensorHistoryResponse results(List<SensorHistoryResponseResults> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<SensorHistoryResponseResults> getResults() {
    return results;
  }
  public void setResults(List<SensorHistoryResponseResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensorHistoryResponse sensorHistoryResponse = (SensorHistoryResponse) o;
    return Objects.equals(results, sensorHistoryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorHistoryResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

