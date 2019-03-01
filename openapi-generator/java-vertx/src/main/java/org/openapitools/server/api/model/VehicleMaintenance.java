package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.VehicleMaintenanceJ1939;
import org.openapitools.server.api.model.VehicleMaintenancePassenger;

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleMaintenance   {
  
  private Long id;
  private VehicleMaintenanceJ1939 j1939 = null;
  private VehicleMaintenancePassenger passenger = null;

  public VehicleMaintenance () {

  }

  public VehicleMaintenance (Long id, VehicleMaintenanceJ1939 j1939, VehicleMaintenancePassenger passenger) {
    this.id = id;
    this.j1939 = j1939;
    this.passenger = passenger;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("j1939")
  public VehicleMaintenanceJ1939 getJ1939() {
    return j1939;
  }
  public void setJ1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
  }

    
  @JsonProperty("passenger")
  public VehicleMaintenancePassenger getPassenger() {
    return passenger;
  }
  public void setPassenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
