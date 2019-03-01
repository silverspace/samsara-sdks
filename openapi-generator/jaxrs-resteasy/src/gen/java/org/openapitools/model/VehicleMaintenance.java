package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VehicleMaintenanceJ1939;
import org.openapitools.model.VehicleMaintenancePassenger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Contains any J1939/Passenger engine light warnings and engine faults.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class VehicleMaintenance   {
  
  private Long id;
  private VehicleMaintenanceJ1939 j1939 = null;
  private VehicleMaintenancePassenger passenger = null;

  /**
   * ID of the vehicle.
   **/
  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
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

