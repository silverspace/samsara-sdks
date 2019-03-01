package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MachineHistoryResponseMachines;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the results for a machine history request
 */
@ApiModel(description = "Contains the results for a machine history request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class MachineHistoryResponse   {
  @JsonProperty("machines")
  @Valid
  private List<MachineHistoryResponseMachines> machines = null;

  public MachineHistoryResponse machines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
    return this;
  }

  public MachineHistoryResponse addMachinesItem(MachineHistoryResponseMachines machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * Get machines
   * @return machines
  */
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.machines, machineHistoryResponse.machines);
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

