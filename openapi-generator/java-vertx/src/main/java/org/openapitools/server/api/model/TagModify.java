package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.TagModifyAdd;
import org.openapitools.server.api.model.TagModifyDelete;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TagModify   {
  
  private TagModifyAdd add = null;
  private TagModifyDelete delete = null;
  private String name;
  private Long parentTagId;

  public TagModify () {

  }

  public TagModify (TagModifyAdd add, TagModifyDelete delete, String name, Long parentTagId) {
    this.add = add;
    this.delete = delete;
    this.name = name;
    this.parentTagId = parentTagId;
  }

    
  @JsonProperty("add")
  public TagModifyAdd getAdd() {
    return add;
  }
  public void setAdd(TagModifyAdd add) {
    this.add = add;
  }

    
  @JsonProperty("delete")
  public TagModifyDelete getDelete() {
    return delete;
  }
  public void setDelete(TagModifyDelete delete) {
    this.delete = delete;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
