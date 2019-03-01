package io.swagger.model;

import io.swagger.model.TagModifyAdd;
import io.swagger.model.TagModifyDelete;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TagModify   {
  
  private @Valid TagModifyAdd add = null;
  private @Valid TagModifyDelete delete = null;
  private @Valid String name = null;
  private @Valid Long parentTagId = null;

  /**
   **/
  public TagModify add(TagModifyAdd add) {
    this.add = add;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("add")
  public TagModifyAdd getAdd() {
    return add;
  }
  public void setAdd(TagModifyAdd add) {
    this.add = add;
  }

  /**
   **/
  public TagModify delete(TagModifyDelete delete) {
    this.delete = delete;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delete")
  public TagModifyDelete getDelete() {
    return delete;
  }
  public void setDelete(TagModifyDelete delete) {
    this.delete = delete;
  }

  /**
   * Updated name of this tag.
   **/
  public TagModify name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
   **/
  public TagModify parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

  
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagModify tagModify = (TagModify) o;
    return Objects.equals(add, tagModify.add) &&
        Objects.equals(delete, tagModify.delete) &&
        Objects.equals(name, tagModify.name) &&
        Objects.equals(parentTagId, tagModify.parentTagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, delete, name, parentTagId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModify {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
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

