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

/**
 * The vehicle on which DVIR was done.
 **/
@ApiModel(description = "The vehicle on which DVIR was done.")
public class DvirBaseVehicle   {
  
  private @Valid String name;
  private @Valid Long id;

  /**
   * The vehicle on which DVIR was done.
   **/
  public DvirBaseVehicle name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Storer's vehicle 19", value = "The vehicle on which DVIR was done.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The vehicle id on which DVIR was done.
   **/
  public DvirBaseVehicle id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "19", value = "The vehicle id on which DVIR was done.")
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
    DvirBaseVehicle dvirBaseVehicle = (DvirBaseVehicle) o;
    return Objects.equals(name, dvirBaseVehicle.name) &&
        Objects.equals(id, dvirBaseVehicle.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

