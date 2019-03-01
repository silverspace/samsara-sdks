package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InlineResponse2005VehicleStats;
import org.openapitools.model.Pagination;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2005  {
  
  @ApiModelProperty(value = "")
  private Pagination pagination = null;

  @ApiModelProperty(required = true, value = "")
  private List<InlineResponse2005VehicleStats> vehicleStats = new ArrayList<InlineResponse2005VehicleStats>();
 /**
   * Get pagination
   * @return pagination
  **/
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public InlineResponse2005 pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

 /**
   * Get vehicleStats
   * @return vehicleStats
  **/
  @JsonProperty("vehicleStats")
  public List<InlineResponse2005VehicleStats> getVehicleStats() {
    return vehicleStats;
  }

  public void setVehicleStats(List<InlineResponse2005VehicleStats> vehicleStats) {
    this.vehicleStats = vehicleStats;
  }

  public InlineResponse2005 vehicleStats(List<InlineResponse2005VehicleStats> vehicleStats) {
    this.vehicleStats = vehicleStats;
    return this;
  }

  public InlineResponse2005 addVehicleStatsItem(InlineResponse2005VehicleStats vehicleStatsItem) {
    this.vehicleStats.add(vehicleStatsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

