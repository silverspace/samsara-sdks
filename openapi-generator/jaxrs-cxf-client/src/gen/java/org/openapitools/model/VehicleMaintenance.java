package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.VehicleMaintenanceJ1939;
import org.openapitools.model.VehicleMaintenancePassenger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains any J1939/Passenger engine light warnings and engine faults.
 **/
@ApiModel(description="Contains any J1939/Passenger engine light warnings and engine faults.")
public class VehicleMaintenance  {
  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long id;

  @ApiModelProperty(value = "")
  private VehicleMaintenanceJ1939 j1939 = null;

  @ApiModelProperty(value = "")
  private VehicleMaintenancePassenger passenger = null;
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

  public VehicleMaintenance id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get j1939
   * @return j1939
  **/
  @JsonProperty("j1939")
  public VehicleMaintenanceJ1939 getJ1939() {
    return j1939;
  }

  public void setJ1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
  }

  public VehicleMaintenance j1939(VehicleMaintenanceJ1939 j1939) {
    this.j1939 = j1939;
    return this;
  }

 /**
   * Get passenger
   * @return passenger
  **/
  @JsonProperty("passenger")
  public VehicleMaintenancePassenger getPassenger() {
    return passenger;
  }

  public void setPassenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
  }

  public VehicleMaintenance passenger(VehicleMaintenancePassenger passenger) {
    this.passenger = passenger;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

