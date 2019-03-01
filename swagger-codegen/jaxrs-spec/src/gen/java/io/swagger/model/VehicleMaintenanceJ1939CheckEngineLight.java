package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * J1939 check engine lights.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "J1939 check engine lights.")

public class VehicleMaintenanceJ1939CheckEngineLight   {
  
  private @Valid Boolean emissionsIsOn = null;
  private @Valid Boolean protectIsOn = null;
  private @Valid Boolean stopIsOn = null;
  private @Valid Boolean warningIsOn = null;

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight emissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("emissionsIsOn")
  public Boolean isEmissionsIsOn() {
    return emissionsIsOn;
  }
  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight protectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("protectIsOn")
  public Boolean isProtectIsOn() {
    return protectIsOn;
  }
  public void setProtectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight stopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stopIsOn")
  public Boolean isStopIsOn() {
    return stopIsOn;
  }
  public void setStopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight warningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("warningIsOn")
  public Boolean isWarningIsOn() {
    return warningIsOn;
  }
  public void setWarningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenanceJ1939CheckEngineLight vehicleMaintenanceJ1939CheckEngineLight = (VehicleMaintenanceJ1939CheckEngineLight) o;
    return Objects.equals(emissionsIsOn, vehicleMaintenanceJ1939CheckEngineLight.emissionsIsOn) &&
        Objects.equals(protectIsOn, vehicleMaintenanceJ1939CheckEngineLight.protectIsOn) &&
        Objects.equals(stopIsOn, vehicleMaintenanceJ1939CheckEngineLight.stopIsOn) &&
        Objects.equals(warningIsOn, vehicleMaintenanceJ1939CheckEngineLight.warningIsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emissionsIsOn, protectIsOn, stopIsOn, warningIsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939CheckEngineLight {\n");
    
    sb.append("    emissionsIsOn: ").append(toIndentedString(emissionsIsOn)).append("\n");
    sb.append("    protectIsOn: ").append(toIndentedString(protectIsOn)).append("\n");
    sb.append("    stopIsOn: ").append(toIndentedString(stopIsOn)).append("\n");
    sb.append("    warningIsOn: ").append(toIndentedString(warningIsOn)).append("\n");
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

