package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.Machine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InlineResponse2007
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class InlineResponse2007   {
  @JsonProperty("machines")
  
  private List<Machine> machines = null;

  public InlineResponse2007 machines(List<Machine> machines) {
    this.machines = machines;
    return this;
  }

  public InlineResponse2007 addMachinesItem(Machine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

   /**
   * Get machines
   * @return machines
  **/
  @ApiModelProperty(value = "")
  public List<Machine> getMachines() {
    return machines;
  }

  public void setMachines(List<Machine> machines) {
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
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.machines, inlineResponse2007.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
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

