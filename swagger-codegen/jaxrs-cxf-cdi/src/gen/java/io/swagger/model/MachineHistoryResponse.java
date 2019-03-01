package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.MachineHistoryResponseMachines;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Contains the results for a machine history request
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Contains the results for a machine history request")

public class MachineHistoryResponse   {
  
  private List<MachineHistoryResponseMachines> machines = new ArrayList<MachineHistoryResponseMachines>();

  /**
   **/
  public MachineHistoryResponse machines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("machines")
  public List<MachineHistoryResponseMachines> getMachines() {
    return machines;
  }
  public void setMachines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponse machineHistoryResponse = (MachineHistoryResponse) o;
    return Objects.equals(machines, machineHistoryResponse.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponse {\n");
    
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
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

