package io.swagger.model;

import io.swagger.model.TaggedVehicleBase;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaggedVehicle  {
  
  @ApiModelProperty(example = "123", required = true, value = "The ID of the Vehicle being tagged.")
 /**
   * The ID of the Vehicle being tagged.
  **/
  private Long id = null;

  @ApiModelProperty(example = "Heavy Duty 123", value = "Name of the Vehicle being tagged.")
 /**
   * Name of the Vehicle being tagged.
  **/
  private String name = null;
 /**
   * The ID of the Vehicle being tagged.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaggedVehicle id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the Vehicle being tagged.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaggedVehicle name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedVehicle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

