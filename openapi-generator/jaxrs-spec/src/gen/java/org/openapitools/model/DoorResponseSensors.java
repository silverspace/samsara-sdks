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



public class DoorResponseSensors   {
  
  private @Valid Boolean doorClosed;
  private @Valid String name;
  private @Valid Long id;

  /**
   * Flag indicating whether the current door is closed or open.
   **/
  public DoorResponseSensors doorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current door is closed or open.")
  @JsonProperty("doorClosed")
  public Boolean getDoorClosed() {
    return doorClosed;
  }
  public void setDoorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
  }

  /**
   * Name of the sensor.
   **/
  public DoorResponseSensors name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Trailer Door Sensor", value = "Name of the sensor.")
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
  public DoorResponseSensors id(Long id) {
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
    DoorResponseSensors doorResponseSensors = (DoorResponseSensors) o;
    return Objects.equals(doorClosed, doorResponseSensors.doorClosed) &&
        Objects.equals(name, doorResponseSensors.name) &&
        Objects.equals(id, doorResponseSensors.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doorClosed, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoorResponseSensors {\n");
    
    sb.append("    doorClosed: ").append(toIndentedString(doorClosed)).append("\n");
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

