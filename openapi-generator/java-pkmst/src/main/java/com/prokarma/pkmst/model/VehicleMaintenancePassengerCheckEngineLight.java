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
 * Passenger vehicle check engine light.
 */
@ApiModel(description = "Passenger vehicle check engine light.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class VehicleMaintenancePassengerCheckEngineLight   {
  @JsonProperty("isOn")
  private Boolean isOn;

  public VehicleMaintenancePassengerCheckEngineLight isOn(Boolean isOn) {
    this.isOn = isOn;
    return this;
  }

   /**
   * Get isOn
   * @return isOn
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsOn() {
    return isOn;
  }

  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassengerCheckEngineLight vehicleMaintenancePassengerCheckEngineLight = (VehicleMaintenancePassengerCheckEngineLight) o;
    return Objects.equals(this.isOn, vehicleMaintenancePassengerCheckEngineLight.isOn);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

