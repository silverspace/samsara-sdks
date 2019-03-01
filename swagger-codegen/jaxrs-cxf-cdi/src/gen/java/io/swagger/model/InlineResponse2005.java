package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse2005VehicleStats;
import io.swagger.model.Pagination;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineResponse2005   {
  
  private Pagination pagination = null;
  private List<InlineResponse2005VehicleStats> vehicleStats = new ArrayList<InlineResponse2005VehicleStats>();

  /**
   **/
  public InlineResponse2005 pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   **/
  public InlineResponse2005 vehicleStats(List<InlineResponse2005VehicleStats> vehicleStats) {
    this.vehicleStats = vehicleStats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("vehicleStats")
  @NotNull
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

