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
 * Contains information about a machine.
 **/
@ApiModel(description = "Contains information about a machine.")
public class Machine   {
  
  private @Valid Long id;
  private @Valid String name;
  private @Valid String notes;

  /**
   * ID of the machine.
   **/
  public Machine id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "123", required = true, value = "ID of the machine.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the machine.
   **/
  public Machine name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Freezer ABC", value = "Name of the machine.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Notes about the machine
   **/
  public Machine notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(example = "This is in the left hallway behind the conveyor belt", value = "Notes about the machine")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Machine machine = (Machine) o;
    return Objects.equals(id, machine.id) &&
        Objects.equals(name, machine.name) &&
        Objects.equals(notes, machine.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Machine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

