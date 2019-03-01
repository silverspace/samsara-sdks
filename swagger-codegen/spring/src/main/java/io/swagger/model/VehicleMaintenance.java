package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleMaintenanceJ1939;
import io.swagger.model.VehicleMaintenancePassenger;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 */
@ApiModel(description = "Contains any J1939/Passenger engine light warnings and engine faults.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class VehicleMaintenance   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("j1939")
  private VehicleMaintenanceJ1939 j1939 = null;

  @JsonProperty("passenger")
  private VehicleMaintenancePassenger passenger = null;

  public VehicleMaintenance id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the vehicle.
   * @return id
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VehicleMaintenance j1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
    return this;
  }

  /**
   * Get j1939
   * @return j1939
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VehicleMaintenanceJ1939 getJ1939() {
    return j1939;
  }

  public void setJ1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
  }

  public VehicleMaintenance passenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
    return this;
  }

  /**
   * Get passenger
   * @return passenger
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VehicleMaintenancePassenger getPassenger() {
    return passenger;
  }

  public void setPassenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenance vehicleMaintenance = (VehicleMaintenance) o;
    return Objects.equals(this.id, vehicleMaintenance.id) &&
        Objects.equals(this.j1939, vehicleMaintenance.j1939) &&
        Objects.equals(this.passenger, vehicleMaintenance.passenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, j1939, passenger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    j1939: ").append(toIndentedString(j1939)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
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

