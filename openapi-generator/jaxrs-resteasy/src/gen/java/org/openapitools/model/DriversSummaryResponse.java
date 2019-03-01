package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DriversSummaryResponseSummaries;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class DriversSummaryResponse   {
  
  private List<DriversSummaryResponseSummaries> summaries = new ArrayList<DriversSummaryResponseSummaries>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Summaries")
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

