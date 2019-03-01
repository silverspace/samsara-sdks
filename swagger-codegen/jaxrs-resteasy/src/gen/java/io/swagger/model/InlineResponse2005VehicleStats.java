package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AuxInputSeries;
import io.swagger.model.EngineState;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class InlineResponse2005VehicleStats   {
  
  private AuxInputSeries auxInput1 = null;
  private AuxInputSeries auxInput2 = null;
  private List<EngineState> engineState = new ArrayList<EngineState>();
  private Long vehicleId = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auxInput1")
  public AuxInputSeries getAuxInput1() {
    return auxInput1;
  }
  public void setAuxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auxInput2")
  public AuxInputSeries getAuxInput2() {
    return auxInput2;
  }
  public void setAuxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("engineState")
  public List<EngineState> getEngineState() {
    return engineState;
  }
  public void setEngineState(List<EngineState> engineState) {
    this.engineState = engineState;
  }

  /**
   * ID of the vehicle.
   **/
  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("vehicleId")
  @NotNull
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005VehicleStats inlineResponse2005VehicleStats = (InlineResponse2005VehicleStats) o;
    return Objects.equals(auxInput1, inlineResponse2005VehicleStats.auxInput1) &&
        Objects.equals(auxInput2, inlineResponse2005VehicleStats.auxInput2) &&
        Objects.equals(engineState, inlineResponse2005VehicleStats.engineState) &&
        Objects.equals(vehicleId, inlineResponse2005VehicleStats.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxInput1, auxInput2, engineState, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005VehicleStats {\n");
    
    sb.append("    auxInput1: ").append(toIndentedString(auxInput1)).append("\n");
    sb.append("    auxInput2: ").append(toIndentedString(auxInput2)).append("\n");
    sb.append("    engineState: ").append(toIndentedString(engineState)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

