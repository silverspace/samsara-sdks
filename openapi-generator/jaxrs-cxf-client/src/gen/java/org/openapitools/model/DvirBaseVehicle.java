package org.openapitools.model;

import io.swagger.annotations.ApiModel;

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
  * The vehicle on which DVIR was done.
 **/
@ApiModel(description="The vehicle on which DVIR was done.")
public class DvirBaseVehicle  {
  
  @ApiModelProperty(example = "Storer's vehicle 19", value = "The vehicle on which DVIR was done.")
 /**
   * The vehicle on which DVIR was done.
  **/
  private String name;

  @ApiModelProperty(example = "19", value = "The vehicle id on which DVIR was done.")
 /**
   * The vehicle id on which DVIR was done.
  **/
  private Long id;
 /**
   * The vehicle on which DVIR was done.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseVehicle name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The vehicle id on which DVIR was done.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DvirBaseVehicle id(Long id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseVehicle {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

