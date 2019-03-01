package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedSensorBase;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class TaggedSensor   {
  
  private Long id;

  private String name;


  /**
   * The ID of the Sensor being tagged.
   **/
  public TaggedSensor id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "345", required = true, value = "The ID of the Sensor being tagged.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Name of the Sensor being tagged.
   **/
  public TaggedSensor name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Temperature Sensor 345", value = "Name of the Sensor being tagged.")
  @JsonProperty("name")
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
    TaggedSensor taggedSensor = (TaggedSensor) o;
    return Objects.equals(id, taggedSensor.id) &&
        Objects.equals(name, taggedSensor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedSensor {\n");
    
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

