package io.swagger.model;

import io.swagger.model.DispatchRouteHistoricalEntry;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DispatchRouteHistory  {
  
  @ApiModelProperty(value = "History of the route's state changes.")
 /**
   * History of the route's state changes.
  **/
  private List<DispatchRouteHistoricalEntry> history = null;
 /**
   * History of the route&#39;s state changes.
   * @return history
  **/
  @JsonProperty("history")
  public List<DispatchRouteHistoricalEntry> getHistory() {
    return history;
  }

  public void setHistory(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
  }

  public DispatchRouteHistory history(List<DispatchRouteHistoricalEntry> history) {
    this.history = history;
    return this;
  }

  public DispatchRouteHistory addHistoryItem(DispatchRouteHistoricalEntry historyItem) {
    this.history.add(historyItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

