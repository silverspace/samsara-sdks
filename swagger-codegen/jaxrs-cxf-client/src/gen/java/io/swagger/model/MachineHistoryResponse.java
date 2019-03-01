package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.MachineHistoryResponseMachines;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains the results for a machine history request
 **/
@ApiModel(description="Contains the results for a machine history request")
public class MachineHistoryResponse  {
  
  @ApiModelProperty(value = "")
  private List<MachineHistoryResponseMachines> machines = null;
 /**
   * Get machines
   * @return machines
  **/
  @JsonProperty("machines")
  public List<MachineHistoryResponseMachines> getMachines() {
    return machines;
  }

  public void setMachines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
  }

  public MachineHistoryResponse machines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
    return this;
  }

  public MachineHistoryResponse addMachinesItem(MachineHistoryResponseMachines machinesItem) {
    this.machines.add(machinesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

