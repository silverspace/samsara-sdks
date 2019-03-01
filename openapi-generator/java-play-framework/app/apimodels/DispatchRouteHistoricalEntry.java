package apimodels;

import apimodels.DispatchRoute;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DispatchRouteHistoricalEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DispatchRouteHistoricalEntry   {
  @JsonProperty("changed_at_ms")
  private Long changedAtMs;

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
    return Objects.equals(changedAtMs, dispatchRouteHistoricalEntry.changedAtMs) &&
        Objects.equals(route, dispatchRouteHistoricalEntry.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, route);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

