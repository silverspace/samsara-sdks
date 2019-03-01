package io.swagger.model;

import io.swagger.model.FleetVehicleLocations;
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

public class FleetVehiclesLocationsInner  {
  
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long id = null;

  @ApiModelProperty(value = "")
  @Valid
  private FleetVehicleLocations locations = null;

  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
 /**
   * Name of the vehicle.
  **/
  private String name = null;
 /**
   * ID of the vehicle.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FleetVehiclesLocationsInner id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public FleetVehicleLocations getLocations() {
    return locations;
  }

  public void setLocations(FleetVehicleLocations locations) {
    this.locations = locations;
  }

  public FleetVehiclesLocationsInner locations(FleetVehicleLocations locations) {
    this.locations = locations;
    return this;
  }

 /**
   * Name of the vehicle.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetVehiclesLocationsInner name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehiclesLocationsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

