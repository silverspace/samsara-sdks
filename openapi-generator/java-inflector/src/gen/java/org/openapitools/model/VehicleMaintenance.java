package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VehicleMaintenanceJ1939;
import org.openapitools.model.VehicleMaintenancePassenger;



/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 **/

@ApiModel(description = "Contains any J1939/Passenger engine light warnings and engine faults.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class VehicleMaintenance   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("j1939")
  private VehicleMaintenanceJ1939 j1939 = null;

  @JsonProperty("passenger")
  private VehicleMaintenancePassenger passenger = null;

  /**
   * ID of the vehicle.
   **/
  public VehicleMaintenance id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public VehicleMaintenance j1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("j1939")
  public VehicleMaintenanceJ1939 getJ1939() {
    return j1939;
  }
  public void setJ1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
  }

  /**
   **/
  public VehicleMaintenance passenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passenger")
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
    return Objects.equals(id, vehicleMaintenance.id) &&
        Objects.equals(j1939, vehicleMaintenance.j1939) &&
        Objects.equals(passenger, vehicleMaintenance.passenger);
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

