package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FleetVehicleLocations;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class FleetVehiclesLocationsInner   {
  
  private Long id = null;
  private FleetVehicleLocations locations = null;
  private String name = null;

  /**
   * ID of the vehicle.
   **/
  public FleetVehiclesLocationsInner id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public FleetVehiclesLocationsInner locations(FleetVehicleLocations locations) {
    this.locations = locations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  public FleetVehicleLocations getLocations() {
    return locations;
  }
  public void setLocations(FleetVehicleLocations locations) {
    this.locations = locations;
  }

  /**
   * Name of the vehicle.
   **/
  public FleetVehiclesLocationsInner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehiclesLocationsInner fleetVehiclesLocationsInner = (FleetVehiclesLocationsInner) o;
    return Objects.equals(id, fleetVehiclesLocationsInner.id) &&
        Objects.equals(locations, fleetVehiclesLocationsInner.locations) &&
        Objects.equals(name, fleetVehiclesLocationsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locations, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

