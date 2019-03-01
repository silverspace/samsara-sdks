package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SensorHistoryResponseResults;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 **/
@ApiModel(description="Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.")
public class SensorHistoryResponse  {
  
  @ApiModelProperty(value = "")
  private List<SensorHistoryResponseResults> results = null;
 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<SensorHistoryResponseResults> getResults() {
    return results;
  }

  public void setResults(List<SensorHistoryResponseResults> results) {
    this.results = results;
  }

  public SensorHistoryResponse results(List<SensorHistoryResponseResults> results) {
    this.results = results;
    return this;
  }

  public SensorHistoryResponse addResultsItem(SensorHistoryResponseResults resultsItem) {
    this.results.add(resultsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

