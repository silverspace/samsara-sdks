package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * J1939 check engine lights.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "J1939 check engine lights.")

public class VehicleMaintenanceJ1939CheckEngineLight   {
  
  private Boolean emissionsIsOn = null;
  private Boolean protectIsOn = null;
  private Boolean stopIsOn = null;
  private Boolean warningIsOn = null;

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

