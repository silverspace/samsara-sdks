package org.openapitools.model;

import org.openapitools.model.DispatchRoute;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DispatchRouteHistoricalEntry  {
  
  @ApiModelProperty(example = "1499411220000", value = "Timestamp that the route was updated, represented as Unix milliseconds since epoch.")
 /**
   * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
  **/
  private Long changedAtMs;

  @ApiModelProperty(value = "")
  @Valid
  private DispatchRoute route = null;
 /**
   * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
   * @return changedAtMs
  **/
  @JsonProperty("changed_at_ms")
  public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  public DispatchRouteHistoricalEntry changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

 /**
   * Get route
   * @return route
  **/
  @JsonProperty("route")
  public DispatchRoute getRoute() {
    return route;
  }

  public void setRoute(DispatchRoute route) {
    this.route = route;
  }

  public DispatchRouteHistoricalEntry route(DispatchRoute route) {
    this.route = route;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRouteHistoricalEntry {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

