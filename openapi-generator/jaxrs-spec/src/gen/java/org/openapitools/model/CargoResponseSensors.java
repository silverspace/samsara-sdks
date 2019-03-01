package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class CargoResponseSensors   {
  
  private @Valid Boolean cargoEmpty;
  private @Valid String name;
  private @Valid Long id;

  /**
   * Flag indicating whether the current cargo is empty or loaded.
   **/
  public CargoResponseSensors cargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current cargo is empty or loaded.")
  @JsonProperty("cargoEmpty")
  public Boolean getCargoEmpty() {
    return cargoEmpty;
  }
  public void setCargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
  }

  /**
   * Name of the sensor.
   **/
  public CargoResponseSensors name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Trailer Cargo Sensor", value = "Name of the sensor.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID of the sensor.
   **/
  public CargoResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "122", value = "ID of the sensor.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CargoResponseSensors cargoResponseSensors = (CargoResponseSensors) o;
    return Objects.equals(cargoEmpty, cargoResponseSensors.cargoEmpty) &&
        Objects.equals(name, cargoResponseSensors.name) &&
        Objects.equals(id, cargoResponseSensors.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cargoEmpty, name, id);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

