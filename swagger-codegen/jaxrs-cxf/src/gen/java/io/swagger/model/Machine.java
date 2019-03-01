package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains information about a machine.
 **/
@ApiModel(description="Contains information about a machine.")
public class Machine  {
  
  @ApiModelProperty(example = "123", required = true, value = "ID of the machine.")
 /**
   * ID of the machine.
  **/
  private Long id = null;

  @ApiModelProperty(example = "Freezer ABC", value = "Name of the machine.")
 /**
   * Name of the machine.
  **/
  private String name = null;

  @ApiModelProperty(example = "This is in the left hallway behind the conveyor belt", value = "Notes about the machine")
 /**
   * Notes about the machine
  **/
  private String notes = null;
 /**
   * ID of the machine.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Machine id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the machine.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Machine name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Notes about the machine
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Machine notes(String notes) {
    this.notes = notes;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

