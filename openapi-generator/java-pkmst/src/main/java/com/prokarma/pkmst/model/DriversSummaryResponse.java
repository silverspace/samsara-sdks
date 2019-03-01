package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DriversSummaryResponseSummaries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DriversSummaryResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DriversSummaryResponse   {
  @JsonProperty("Summaries")
  
  private List<DriversSummaryResponseSummaries> summaries = null;

  public DriversSummaryResponse summaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
    return this;
  }

  public DriversSummaryResponse addSummariesItem(DriversSummaryResponseSummaries summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<>();
    }
    this.summaries.add(summariesItem);
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")
  public List<DriversSummaryResponseSummaries> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
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
    return Objects.equals(this.summaries, driversSummaryResponse.summaries);
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

