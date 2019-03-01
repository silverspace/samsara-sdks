package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * J1939 check engine lights.
 */
@ApiModel(description = "J1939 check engine lights.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class VehicleMaintenanceJ1939CheckEngineLight   {
  @JsonProperty("protectIsOn")
  private Boolean protectIsOn;

  @JsonProperty("stopIsOn")
  private Boolean stopIsOn;

  @JsonProperty("warningIsOn")
  private Boolean warningIsOn;

  @JsonProperty("emissionsIsOn")
  private Boolean emissionsIsOn;

  public VehicleMaintenanceJ1939CheckEngineLight protectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
    return this;
  }

   /**
   * Get protectIsOn
   * @return protectIsOn
  **/
  @ApiModelProperty(value = "")
  public Boolean getProtectIsOn() {
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
  public Boolean getStopIsOn() {
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
  public Boolean getWarningIsOn() {
    return warningIsOn;
  }

  public void setWarningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight emissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
    return this;
  }

   /**
   * Get emissionsIsOn
   * @return emissionsIsOn
  **/
  @ApiModelProperty(value = "")
  public Boolean getEmissionsIsOn() {
    return emissionsIsOn;
  }

  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
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
    return Objects.equals(this.protectIsOn, vehicleMaintenanceJ1939CheckEngineLight.protectIsOn) &&
        Objects.equals(this.stopIsOn, vehicleMaintenanceJ1939CheckEngineLight.stopIsOn) &&
        Objects.equals(this.warningIsOn, vehicleMaintenanceJ1939CheckEngineLight.warningIsOn) &&
        Objects.equals(this.emissionsIsOn, vehicleMaintenanceJ1939CheckEngineLight.emissionsIsOn);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

