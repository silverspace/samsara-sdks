package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DoorResponseSensors   {
  
  private @Valid Boolean doorClosed = null;
  private @Valid Long id = null;
  private @Valid String name = null;

  /**
   * Flag indicating whether the current door is closed or open.
   **/
  public DoorResponseSensors doorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current door is closed or open.")
  @JsonProperty("doorClosed")
  public Boolean isDoorClosed() {
    return doorClosed;
  }
  public void setDoorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
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
        Objects.equals(id, doorResponseSensors.id) &&
        Objects.equals(name, doorResponseSensors.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doorClosed, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoorResponseSensors {\n");
    
    sb.append("    doorClosed: ").append(toIndentedString(doorClosed)).append("\n");
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

