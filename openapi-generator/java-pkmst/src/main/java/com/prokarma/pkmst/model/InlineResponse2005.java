package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.InlineResponse2005VehicleStats;
import com.prokarma.pkmst.model.Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InlineResponse2005
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

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
  @ApiModelProperty(value = "")
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
    this.vehicleStats.add(vehicleStatsItem);
    return this;
  }

   /**
   * Get vehicleStats
   * @return vehicleStats
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.pagination, inlineResponse2005.pagination) &&
        Objects.equals(this.vehicleStats, inlineResponse2005.vehicleStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, vehicleStats);
  }

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

