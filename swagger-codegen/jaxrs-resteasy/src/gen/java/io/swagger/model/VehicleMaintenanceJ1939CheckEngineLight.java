package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="J1939 check engine lights.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class VehicleMaintenanceJ1939CheckEngineLight   {
  
  private Boolean emissionsIsOn = null;
  private Boolean protectIsOn = null;
  private Boolean stopIsOn = null;
  private Boolean warningIsOn = null;

  /**
   **/
  
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

