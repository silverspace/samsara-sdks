package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FleetVehicleLocations;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FleetVehiclesLocationsInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class FleetVehiclesLocationsInner   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("locations")
  private FleetVehicleLocations locations = null;

  @JsonProperty("name")
  private String name = null;

  public FleetVehiclesLocationsInner id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the vehicle.
   * @return id
  **/
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FleetVehiclesLocationsInner locations(FleetVehicleLocations locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FleetVehicleLocations getLocations() {
    return locations;
  }

  public void setLocations(FleetVehicleLocations locations) {
    this.locations = locations;
  }

  public FleetVehiclesLocationsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the vehicle.
   * @return name
  **/
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")


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
    return Objects.equals(this.id, fleetVehiclesLocationsInner.id) &&
        Objects.equals(this.locations, fleetVehiclesLocationsInner.locations) &&
        Objects.equals(this.name, fleetVehiclesLocationsInner.name);
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

