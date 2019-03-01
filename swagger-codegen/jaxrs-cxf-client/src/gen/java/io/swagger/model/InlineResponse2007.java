package io.swagger.model;

import io.swagger.model.Machine;
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

public class InlineResponse2007  {
  
  @ApiModelProperty(value = "")
  private List<Machine> machines = null;
 /**
   * Get machines
   * @return machines
  **/
  @JsonProperty("machines")
  public List<Machine> getMachines() {
    return machines;
  }

  public void setMachines(List<Machine> machines) {
    this.machines = machines;
  }

  public InlineResponse2007 machines(List<Machine> machines) {
    this.machines = machines;
    return this;
  }

  public InlineResponse2007 addMachinesItem(Machine machinesItem) {
    this.machines.add(machinesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

