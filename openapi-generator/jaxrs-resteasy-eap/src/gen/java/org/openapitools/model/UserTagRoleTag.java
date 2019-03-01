package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class UserTagRoleTag   {
  

  private Long parentTagId;

  private String name;

  private Long id;

  /**
   * The ID of this tag.
   **/
  
  @ApiModelProperty(example = "12345", value = "The ID of this tag.")
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  /**
   * Name of this tag.
   **/
  
  @ApiModelProperty(example = "North Carolina Distribution", required = true, value = "Name of this tag.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ID of this tag.
   **/
  
  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
  @JsonProperty("id")
  @NotNull
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
    UserTagRoleTag userTagRoleTag = (UserTagRoleTag) o;
    return Objects.equals(parentTagId, userTagRoleTag.parentTagId) &&
        Objects.equals(name, userTagRoleTag.name) &&
        Objects.equals(id, userTagRoleTag.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentTagId, name, id);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

