package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineObject23   {
  
  private Long groupId;


  /**
   * Group ID to query.
   **/
  public InlineObject23 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject23 inlineObject23 = (InlineObject23) o;
    return Objects.equals(groupId, inlineObject23.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject23 {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

