package apimodels;

import apimodels.DriversSummaryResponseSummaries;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DriversSummaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DriversSummaryResponse   {
  @JsonProperty("Summaries")
  private List<DriversSummaryResponseSummaries> summaries = null;

  public DriversSummaryResponse summaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
    return this;
  }

  public DriversSummaryResponse addSummariesItem(DriversSummaryResponseSummaries summariesItem) {
    if (summaries == null) {
      summaries = new ArrayList<>();
    }
    summaries.add(summariesItem);
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

