package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DoorResponseSensors   {
  
  private Boolean doorClosed;
  private String name;
  private Long id;

  public DoorResponseSensors () {

  }

  public DoorResponseSensors (Boolean doorClosed, String name, Long id) {
    this.doorClosed = doorClosed;
    this.name = name;
    this.id = id;
  }

    
  @JsonProperty("doorClosed")
  public Boolean getDoorClosed() {
    return doorClosed;
  }
  public void setDoorClosed(Boolean doorClosed) {
    this.doorClosed = doorClosed;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
