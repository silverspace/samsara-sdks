package apimodels;

import apimodels.InlineResponse2005VehicleStats;
import apimodels.Pagination;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2005
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2005   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("vehicleStats")
  private List<InlineResponse2005VehicleStats> vehicleStats = new ArrayList<>();

  public InlineResponse2005 pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @Valid
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public InlineResponse2005 vehicleStats(List<InlineResponse2005VehicleStats> vehicleStats) {
    this.vehicleStats = vehicleStats;
    return this;
  }

  public InlineResponse2005 addVehicleStatsItem(InlineResponse2005VehicleStats vehicleStatsItem) {
    vehicleStats.add(vehicleStatsItem);
    return this;
  }

   /**
   * Get vehicleStats
   * @return vehicleStats
  **/
  @NotNull
@Valid
  public List<InlineResponse2005VehicleStats> getVehicleStats() {
    return vehicleStats;
  }

  public void setVehicleStats(List<InlineResponse2005VehicleStats> vehicleStats) {
    this.vehicleStats = vehicleStats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(pagination, inlineResponse2005.pagination) &&
        Objects.equals(vehicleStats, inlineResponse2005.vehicleStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, vehicleStats);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    vehicleStats: ").append(toIndentedString(vehicleStats)).append("\n");
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

