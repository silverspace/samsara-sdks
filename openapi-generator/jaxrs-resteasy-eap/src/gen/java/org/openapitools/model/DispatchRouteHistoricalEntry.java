package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchRoute;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class DispatchRouteHistoricalEntry   {
  

  private Long changedAtMs;

  private DispatchRoute route = null;

  /**
   * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
   **/
  
  @ApiModelProperty(example = "1499411220000", value = "Timestamp that the route was updated, represented as Unix milliseconds since epoch.")
  @JsonProperty("changed_at_ms")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("route")
  public DispatchRoute getRoute() {
    return route;
  }
  public void setRoute(DispatchRoute route) {
    this.route = route;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteHistoricalEntry dispatchRouteHistoricalEntry = (DispatchRouteHistoricalEntry) o;
    return Objects.equals(changedAtMs, dispatchRouteHistoricalEntry.changedAtMs) &&
        Objects.equals(route, dispatchRouteHistoricalEntry.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, route);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

