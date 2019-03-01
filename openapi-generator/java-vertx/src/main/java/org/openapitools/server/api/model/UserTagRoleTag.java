package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class UserTagRoleTag   {
  
  private Long parentTagId;
  private String name;
  private Long id;

  public UserTagRoleTag () {

  }

  public UserTagRoleTag (Long parentTagId, String name, Long id) {
    this.parentTagId = parentTagId;
    this.name = name;
    this.id = id;
  }

    
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("id")
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
