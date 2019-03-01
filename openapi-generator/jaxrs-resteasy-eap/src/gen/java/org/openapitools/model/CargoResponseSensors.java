package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class CargoResponseSensors   {
  

  private Boolean cargoEmpty;

  private String name;

  private Long id;

  /**
   * Flag indicating whether the current cargo is empty or loaded.
   **/
  
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
  
  @ApiModelProperty(example = "122", value = "ID of the sensor.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

