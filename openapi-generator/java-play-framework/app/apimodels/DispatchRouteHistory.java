package apimodels;

import apimodels.DispatchRouteHistoricalEntry;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DispatchRouteHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DispatchRouteHistory   {
  @JsonProperty("history")
  private List<DispatchRouteHistoricalEntry> history = null;

  public DispatchRouteHistory history(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
    return this;
  }

  public DispatchRouteHistory addHistoryItem(DispatchRouteHistoricalEntry historyItem) {
    if (history == null) {
      history = new ArrayList<>();
    }
    history.add(historyItem);
    return this;
  }

   /**
   * History of the route's state changes.
   * @return history
  **/
  @Valid
  public List<DispatchRouteHistoricalEntry> getHistory() {
    return history;
  }

  public void setHistory(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteHistory dispatchRouteHistory = (DispatchRouteHistory) o;
    return Objects.equals(history, dispatchRouteHistory.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRouteHistory {\n");
    
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

