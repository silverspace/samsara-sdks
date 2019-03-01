package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DispatchRouteHistoricalEntry;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DispatchRouteHistory   {
  
  private List<DispatchRouteHistoricalEntry> history = null;


  /**
   * History of the route&#39;s state changes.
   **/
  public DispatchRouteHistory history(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
    return this;
  }

  
  @ApiModelProperty(value = "History of the route's state changes.")
  @JsonProperty("history")
  public List<DispatchRouteHistoricalEntry> getHistory() {
    return history;
  }
  public void setHistory(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
  }

  public DispatchRouteHistory addHistoryItem(DispatchRouteHistoricalEntry historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<DispatchRouteHistoricalEntry>();
    }
    this.history.add(historyItem);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

