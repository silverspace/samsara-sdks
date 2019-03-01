package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CargoResponseSensors
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class CargoResponseSensors   {
  @JsonProperty("cargoEmpty")
  private Boolean cargoEmpty = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public CargoResponseSensors cargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
    return this;
  }

  /**
   * Flag indicating whether the current cargo is empty or loaded.
   * @return cargoEmpty
  **/
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current cargo is empty or loaded.")


  public Boolean isCargoEmpty() {
    return cargoEmpty;
  }

  public void setCargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
  }

  public CargoResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the sensor.
   * @return id
  **/
  @ApiModelProperty(example = "122", value = "ID of the sensor.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CargoResponseSensors name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the sensor.
   * @return name
  **/
  @ApiModelProperty(example = "Trailer Cargo Sensor", value = "Name of the sensor.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(this.cargoEmpty, cargoResponseSensors.cargoEmpty) &&
        Objects.equals(this.id, cargoResponseSensors.id) &&
        Objects.equals(this.name, cargoResponseSensors.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cargoEmpty, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoResponseSensors {\n");
    
    sb.append("    cargoEmpty: ").append(toIndentedString(cargoEmpty)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

