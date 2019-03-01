package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DriversSummaryResponseSummaries;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DriversSummaryResponse   {
  
  private List<DriversSummaryResponseSummaries> summaries = new ArrayList<>();

  public DriversSummaryResponse () {

  }

  public DriversSummaryResponse (List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
  }

    
  @JsonProperty("Summaries")
  public List<DriversSummaryResponseSummaries> getSummaries() {
    return summaries;
  }
  public void setSummaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
