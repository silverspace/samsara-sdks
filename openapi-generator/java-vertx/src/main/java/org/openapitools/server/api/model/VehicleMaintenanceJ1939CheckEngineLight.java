package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * J1939 check engine lights.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleMaintenanceJ1939CheckEngineLight   {
  
  private Boolean protectIsOn;
  private Boolean stopIsOn;
  private Boolean warningIsOn;
  private Boolean emissionsIsOn;

  public VehicleMaintenanceJ1939CheckEngineLight () {

  }

  public VehicleMaintenanceJ1939CheckEngineLight (Boolean protectIsOn, Boolean stopIsOn, Boolean warningIsOn, Boolean emissionsIsOn) {
    this.protectIsOn = protectIsOn;
    this.stopIsOn = stopIsOn;
    this.warningIsOn = warningIsOn;
    this.emissionsIsOn = emissionsIsOn;
  }

    
  @JsonProperty("protectIsOn")
  public Boolean getProtectIsOn() {
    return protectIsOn;
  }
  public void setProtectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
  }

    
  @JsonProperty("stopIsOn")
  public Boolean getStopIsOn() {
    return stopIsOn;
  }
  public void setStopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
  }

    
  @JsonProperty("warningIsOn")
  public Boolean getWarningIsOn() {
    return warningIsOn;
  }
  public void setWarningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
  }

    
  @JsonProperty("emissionsIsOn")
  public Boolean getEmissionsIsOn() {
    return emissionsIsOn;
  }
  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenanceJ1939CheckEngineLight vehicleMaintenanceJ1939CheckEngineLight = (VehicleMaintenanceJ1939CheckEngineLight) o;
    return Objects.equals(protectIsOn, vehicleMaintenanceJ1939CheckEngineLight.protectIsOn) &&
        Objects.equals(stopIsOn, vehicleMaintenanceJ1939CheckEngineLight.stopIsOn) &&
        Objects.equals(warningIsOn, vehicleMaintenanceJ1939CheckEngineLight.warningIsOn) &&
        Objects.equals(emissionsIsOn, vehicleMaintenanceJ1939CheckEngineLight.emissionsIsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectIsOn, stopIsOn, warningIsOn, emissionsIsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939CheckEngineLight {\n");
    
    sb.append("    protectIsOn: ").append(toIndentedString(protectIsOn)).append("\n");
    sb.append("    stopIsOn: ").append(toIndentedString(stopIsOn)).append("\n");
    sb.append("    warningIsOn: ").append(toIndentedString(warningIsOn)).append("\n");
    sb.append("    emissionsIsOn: ").append(toIndentedString(emissionsIsOn)).append("\n");
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
