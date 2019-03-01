package org.openapitools.model;

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

public class UserTagRoleTag  {
  
  @ApiModelProperty(example = "12345", value = "The ID of this tag.")
 /**
   * The ID of this tag.
  **/
  private Long parentTagId;

  @ApiModelProperty(example = "North Carolina Distribution", required = true, value = "Name of this tag.")
 /**
   * Name of this tag.
  **/
  private String name;

  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
 /**
   * The ID of this tag.
  **/
  private Long id;
 /**
   * The ID of this tag.
   * @return parentTagId
  **/
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public UserTagRoleTag parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

 /**
   * Name of this tag.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTagRoleTag name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The ID of this tag.
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

  public UserTagRoleTag id(Long id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTagRoleTag {\n");
    
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

