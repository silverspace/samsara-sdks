package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TagModifyAdd;
import org.openapitools.model.TagModifyDelete;

/**
 * TagModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class TagModify   {
  @JsonProperty("add")
  private TagModifyAdd add = null;

  @JsonProperty("delete")
  private TagModifyDelete delete = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentTagId")
  private Long parentTagId;

  public TagModify add(TagModifyAdd add) {
    this.add = add;
    return this;
  }

   /**
   * Get add
   * @return add
  **/
  @ApiModelProperty(value = "")
  public TagModifyAdd getAdd() {
    return add;
  }

  public void setAdd(TagModifyAdd add) {
    this.add = add;
  }

  public TagModify delete(TagModifyDelete delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(value = "")
  public TagModifyDelete getDelete() {
    return delete;
  }

  public void setDelete(TagModifyDelete delete) {
    this.delete = delete;
  }

  public TagModify name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Updated name of this tag.
   * @return name
  **/
  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagModify parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

   /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   * @return parentTagId
  **/
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
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
    return Objects.equals(this.add, tagModify.add) &&
        Objects.equals(this.delete, tagModify.delete) &&
        Objects.equals(this.name, tagModify.name) &&
        Objects.equals(this.parentTagId, tagModify.parentTagId);
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

