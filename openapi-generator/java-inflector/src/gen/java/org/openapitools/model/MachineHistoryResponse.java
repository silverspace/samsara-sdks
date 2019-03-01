package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MachineHistoryResponseMachines;



/**
 * Contains the results for a machine history request
 **/

@ApiModel(description = "Contains the results for a machine history request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class MachineHistoryResponse   {
  @JsonProperty("machines")
  private List<MachineHistoryResponseMachines> machines = null;

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

