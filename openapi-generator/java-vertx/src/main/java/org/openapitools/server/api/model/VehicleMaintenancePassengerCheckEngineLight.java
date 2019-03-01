package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Passenger vehicle check engine light.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleMaintenancePassengerCheckEngineLight   {
  
  private Boolean isOn;

  public VehicleMaintenancePassengerCheckEngineLight () {

  }

  public VehicleMaintenancePassengerCheckEngineLight (Boolean isOn) {
    this.isOn = isOn;
  }

    
  @JsonProperty("isOn")
  public Boolean getIsOn() {
    return isOn;
  }
  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassengerCheckEngineLight vehicleMaintenancePassengerCheckEngineLight = (VehicleMaintenancePassengerCheckEngineLight) o;
    return Objects.equals(isOn, vehicleMaintenancePassengerCheckEngineLight.isOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassengerCheckEngineLight {\n");
    
    sb.append("    isOn: ").append(toIndentedString(isOn)).append("\n");
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
