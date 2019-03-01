package apimodels;

import apimodels.SensorHistoryResponseResults;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SensorHistoryResponse   {
  @JsonProperty("results")
  private List<SensorHistoryResponseResults> results = null;

  public SensorHistoryResponse results(List<SensorHistoryResponseResults> results) {
    this.results = results;
    return this;
  }

  public SensorHistoryResponse addResultsItem(SensorHistoryResponseResults resultsItem) {
    if (results == null) {
      results = new ArrayList<>();
    }
    results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

