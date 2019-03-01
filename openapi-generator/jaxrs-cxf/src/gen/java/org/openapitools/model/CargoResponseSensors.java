package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CargoResponseSensors  {
  
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current cargo is empty or loaded.")
 /**
   * Flag indicating whether the current cargo is empty or loaded.
  **/
  private Boolean cargoEmpty;

  @ApiModelProperty(example = "Trailer Cargo Sensor", value = "Name of the sensor.")
 /**
   * Name of the sensor.
  **/
  private String name;

  @ApiModelProperty(example = "122", value = "ID of the sensor.")
 /**
   * ID of the sensor.
  **/
  private Long id;
 /**
   * Flag indicating whether the current cargo is empty or loaded.
   * @return cargoEmpty
  **/
  @JsonProperty("cargoEmpty")
  public Boolean getCargoEmpty() {
    return cargoEmpty;
  }

  public void setCargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
  }

  public CargoResponseSensors cargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
    return this;
  }

 /**
   * Name of the sensor.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CargoResponseSensors name(String name) {
    this.name = name;
    return this;
  }

 /**
   * ID of the sensor.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CargoResponseSensors id(Long id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoResponseSensors {\n");
    
    sb.append("    cargoEmpty: ").append(toIndentedString(cargoEmpty)).append("\n");
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

