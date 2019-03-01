package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class CargoResponseSensors   {
  
  private Boolean cargoEmpty;
  private String name;
  private Long id;

  public CargoResponseSensors () {

  }

  public CargoResponseSensors (Boolean cargoEmpty, String name, Long id) {
    this.cargoEmpty = cargoEmpty;
    this.name = name;
    this.id = id;
  }

    
  @JsonProperty("cargoEmpty")
  public Boolean getCargoEmpty() {
    return cargoEmpty;
  }
  public void setCargoEmpty(Boolean cargoEmpty) {
    this.cargoEmpty = cargoEmpty;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
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
