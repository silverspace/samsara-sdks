package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DispatchRouteHistoricalEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DispatchRouteHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DispatchRouteHistory   {
  @JsonProperty("history")
  @Valid
  private List<DispatchRouteHistoricalEntry> history = null;

  public DispatchRouteHistory history(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
    return this;
  }

  public DispatchRouteHistory addHistoryItem(DispatchRouteHistoricalEntry historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * History of the route's state changes.
   * @return history
  */
  @ApiModelProperty(value = "History of the route's state changes.")

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
    return Objects.equals(this.history, dispatchRouteHistory.history);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

