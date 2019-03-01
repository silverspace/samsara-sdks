package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Pagination;
import org.openapitools.model.Vehicle;
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

public class InlineResponse2002  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Pagination pagination = null;

  @ApiModelProperty(example = "101", value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId;

  @ApiModelProperty(value = "")
  @Valid
  private List<Vehicle> vehicles = null;
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

  public InlineResponse2002 pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

 /**
   * Group ID to query.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineResponse2002 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get vehicles
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public InlineResponse2002 vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2002 addVehiclesItem(Vehicle vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

