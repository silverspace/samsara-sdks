package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DoorResponseSensors
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DoorResponseSensors   {
  @JsonProperty("doorClosed")
  private Boolean doorClosed;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  public DoorResponseSensors doorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
    return this;
  }

   /**
   * Flag indicating whether the current door is closed or open.
   * @return doorClosed
  **/
  @ApiModelProperty(example = "true", value = "Flag indicating whether the current door is closed or open.")
  public Boolean getDoorClosed() {
    return doorClosed;
  }

  public void setDoorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
  }

  public DoorResponseSensors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sensor.
   * @return name
  **/
  @ApiModelProperty(example = "Trailer Door Sensor", value = "Name of the sensor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DoorResponseSensors id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoorResponseSensors doorResponseSensors = (DoorResponseSensors) o;
    return Objects.equals(this.doorClosed, doorResponseSensors.doorClosed) &&
        Objects.equals(this.name, doorResponseSensors.name) &&
        Objects.equals(this.id, doorResponseSensors.id);
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

