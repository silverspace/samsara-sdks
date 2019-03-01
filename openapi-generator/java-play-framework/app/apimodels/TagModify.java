package apimodels;

import apimodels.TagModifyAdd;
import apimodels.TagModifyDelete;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TagModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

