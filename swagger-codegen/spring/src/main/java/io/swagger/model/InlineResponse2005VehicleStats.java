package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuxInputSeries;
import io.swagger.model.EngineState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2005VehicleStats
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class InlineResponse2005VehicleStats   {
  @JsonProperty("auxInput1")
  private AuxInputSeries auxInput1 = null;

  @JsonProperty("auxInput2")
  private AuxInputSeries auxInput2 = null;

  @JsonProperty("engineState")
  @Valid
  private List<EngineState> engineState = null;

  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  public InlineResponse2005VehicleStats auxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
    return this;
  }

  /**
   * Get auxInput1
   * @return auxInput1
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AuxInputSeries getAuxInput1() {
    return auxInput1;
  }

  public void setAuxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
  }

  public InlineResponse2005VehicleStats auxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
    return this;
  }

  /**
   * Get auxInput2
   * @return auxInput2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AuxInputSeries getAuxInput2() {
    return auxInput2;
  }

  public void setAuxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
  }

  public InlineResponse2005VehicleStats engineState(List<EngineState> engineState) {
    this.engineState = engineState;
    return this;
  }

  public InlineResponse2005VehicleStats addEngineStateItem(EngineState engineStateItem) {
    if (this.engineState == null) {
      this.engineState = new ArrayList<EngineState>();
    }
    this.engineState.add(engineStateItem);
    return this;
  }

  /**
   * Get engineState
   * @return engineState
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EngineState> getEngineState() {
    return engineState;
  }

  public void setEngineState(List<EngineState> engineState) {
    this.engineState = engineState;
  }

  public InlineResponse2005VehicleStats vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * ID of the vehicle.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
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
    return Objects.equals(this.auxInput1, inlineResponse2005VehicleStats.auxInput1) &&
        Objects.equals(this.auxInput2, inlineResponse2005VehicleStats.auxInput2) &&
        Objects.equals(this.engineState, inlineResponse2005VehicleStats.engineState) &&
        Objects.equals(this.vehicleId, inlineResponse2005VehicleStats.vehicleId);
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

