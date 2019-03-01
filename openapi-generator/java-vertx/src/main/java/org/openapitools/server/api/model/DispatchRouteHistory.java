package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DispatchRouteHistoricalEntry;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DispatchRouteHistory   {
  
  private List<DispatchRouteHistoricalEntry> history = new ArrayList<>();

  public DispatchRouteHistory () {

  }

  public DispatchRouteHistory (List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
  }

    
  @JsonProperty("history")
  public List<DispatchRouteHistoricalEntry> getHistory() {
    return history;
  }
  public void setHistory(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
