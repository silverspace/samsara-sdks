package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * J1939 check engine lights.
 */
@ApiModel(description = "J1939 check engine lights.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class VehicleMaintenanceJ1939CheckEngineLight   {
  @JsonProperty("emissionsIsOn")
  private Boolean emissionsIsOn = null;

  @JsonProperty("protectIsOn")
  private Boolean protectIsOn = null;

  @JsonProperty("stopIsOn")
  private Boolean stopIsOn = null;

  @JsonProperty("warningIsOn")
  private Boolean warningIsOn = null;

  public VehicleMaintenanceJ1939CheckEngineLight emissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
    return this;
  }

  /**
   * Get emissionsIsOn
   * @return emissionsIsOn
  **/
  @ApiModelProperty(value = "")


  public Boolean isEmissionsIsOn() {
    return emissionsIsOn;
  }

  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight protectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
    return this;
  }

  /**
   * Get protectIsOn
   * @return protectIsOn
  **/
  @ApiModelProperty(value = "")


  public Boolean isProtectIsOn() {
    return protectIsOn;
  }

  public void setProtectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight stopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
    return this;
  }

  /**
   * Get stopIsOn
   * @return stopIsOn
  **/
  @ApiModelProperty(value = "")


  public Boolean isStopIsOn() {
    return stopIsOn;
  }

  public void setStopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight warningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
    return this;
  }

  /**
   * Get warningIsOn
   * @return warningIsOn
  **/
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.emissionsIsOn, vehicleMaintenanceJ1939CheckEngineLight.emissionsIsOn) &&
        Objects.equals(this.protectIsOn, vehicleMaintenanceJ1939CheckEngineLight.protectIsOn) &&
        Objects.equals(this.stopIsOn, vehicleMaintenanceJ1939CheckEngineLight.stopIsOn) &&
        Objects.equals(this.warningIsOn, vehicleMaintenanceJ1939CheckEngineLight.warningIsOn);
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

