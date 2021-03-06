package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleLocation;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2003  {
  
  @ApiModelProperty(example = "101", value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId;

  @ApiModelProperty(value = "")
  private List<VehicleLocation> vehicles = null;
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

  public InlineResponse2003 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get vehicles
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<VehicleLocation> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleLocation> vehicles) {
    this.vehicles = vehicles;
  }

  public InlineResponse2003 vehicles(List<VehicleLocation> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2003 addVehiclesItem(VehicleLocation vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
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

