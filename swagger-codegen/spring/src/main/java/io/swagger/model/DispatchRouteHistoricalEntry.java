package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DispatchRoute;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DispatchRouteHistoricalEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class DispatchRouteHistoricalEntry   {
  @JsonProperty("changed_at_ms")
  private Long changedAtMs = null;

  @JsonProperty("route")
  private DispatchRoute route = null;

  public DispatchRouteHistoricalEntry changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

  /**
   * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
   * @return changedAtMs
  **/
  @ApiModelProperty(example = "1499411220000", value = "Timestamp that the route was updated, represented as Unix milliseconds since epoch.")


  public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  public DispatchRouteHistoricalEntry route(DispatchRoute route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DispatchRoute getRoute() {
    return route;
  }

  public void setRoute(DispatchRoute route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteHistoricalEntry dispatchRouteHistoricalEntry = (DispatchRouteHistoricalEntry) o;
    return Objects.equals(this.changedAtMs, dispatchRouteHistoricalEntry.changedAtMs) &&
        Objects.equals(this.route, dispatchRouteHistoricalEntry.route);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

