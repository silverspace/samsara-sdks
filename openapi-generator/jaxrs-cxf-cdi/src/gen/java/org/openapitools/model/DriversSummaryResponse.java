package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DriversSummaryResponseSummaries;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DriversSummaryResponse   {
  
  private List<DriversSummaryResponseSummaries> summaries = null;


  /**
   **/
  public DriversSummaryResponse summaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Summaries")
  public List<DriversSummaryResponseSummaries> getSummaries() {
    return summaries;
  }
  public void setSummaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
  }

  public DriversSummaryResponse addSummariesItem(DriversSummaryResponseSummaries summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<DriversSummaryResponseSummaries>();
    }
    this.summaries.add(summariesItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversSummaryResponse driversSummaryResponse = (DriversSummaryResponse) o;
    return Objects.equals(summaries, driversSummaryResponse.summaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryResponse {\n");
    
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
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

