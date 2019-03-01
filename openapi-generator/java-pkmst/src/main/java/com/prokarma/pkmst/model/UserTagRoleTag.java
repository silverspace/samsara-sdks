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
 * UserTagRoleTag
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class UserTagRoleTag   {
  @JsonProperty("parentTagId")
  private Long parentTagId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  public UserTagRoleTag parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

   /**
   * The ID of this tag.
   * @return parentTagId
  **/
  @ApiModelProperty(example = "12345", value = "The ID of this tag.")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public UserTagRoleTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this tag.
   * @return name
  **/
  @ApiModelProperty(example = "North Carolina Distribution", required = true, value = "Name of this tag.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTagRoleTag id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this tag.
   * @return id
  **/
  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTagRoleTag userTagRoleTag = (UserTagRoleTag) o;
    return Objects.equals(this.parentTagId, userTagRoleTag.parentTagId) &&
        Objects.equals(this.name, userTagRoleTag.name) &&
        Objects.equals(this.id, userTagRoleTag.id);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

