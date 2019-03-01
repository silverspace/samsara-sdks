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
 * Contains information about a machine.
 */
@ApiModel(description = "Contains information about a machine.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class Machine   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notes")
  private String notes;

  public Machine id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the machine.
   * @return id
  **/
  @ApiModelProperty(example = "123", required = true, value = "ID of the machine.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Machine name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the machine.
   * @return name
  **/
  @ApiModelProperty(example = "Freezer ABC", value = "Name of the machine.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Machine notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about the machine
   * @return notes
  **/
  @ApiModelProperty(example = "This is in the left hallway behind the conveyor belt", value = "Notes about the machine")
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
    return Objects.equals(this.id, machine.id) &&
        Objects.equals(this.name, machine.name) &&
        Objects.equals(this.notes, machine.notes);
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

