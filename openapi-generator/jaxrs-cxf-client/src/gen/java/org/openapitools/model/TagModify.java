package org.openapitools.model;

import org.openapitools.model.TagModifyAdd;
import org.openapitools.model.TagModifyDelete;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TagModify  {
  
  @ApiModelProperty(value = "")
  private TagModifyAdd add = null;

  @ApiModelProperty(value = "")
  private TagModifyDelete delete = null;

  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")
 /**
   * Updated name of this tag.
  **/
  private String name;

  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
 /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  **/
  private Long parentTagId;
 /**
   * Get add
   * @return add
  **/
  @JsonProperty("add")
  public TagModifyAdd getAdd() {
    return add;
  }

  public void setAdd(TagModifyAdd add) {
    this.add = add;
  }

  public TagModify add(TagModifyAdd add) {
    this.add = add;
    return this;
  }

 /**
   * Get delete
   * @return delete
  **/
  @JsonProperty("delete")
  public TagModifyDelete getDelete() {
    return delete;
  }

  public void setDelete(TagModifyDelete delete) {
    this.delete = delete;
  }

  public TagModify delete(TagModifyDelete delete) {
    this.delete = delete;
    return this;
  }

 /**
   * Updated name of this tag.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagModify name(String name) {
    this.name = name;
    return this;
  }

 /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
   * @return parentTagId
  **/
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public TagModify parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

