package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.UserTagRoleTag;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class UserTagRole   {
  
  private String role;
  private String roleId;
  private UserTagRoleTag tag = null;

  public UserTagRole () {

  }

  public UserTagRole (String role, String roleId, UserTagRoleTag tag) {
    this.role = role;
    this.roleId = roleId;
    this.tag = tag;
  }

    
  @JsonProperty("role")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

    
  @JsonProperty("roleId")
  public String getRoleId() {
    return roleId;
  }
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

    
  @JsonProperty("tag")
  public UserTagRoleTag getTag() {
    return tag;
  }
  public void setTag(UserTagRoleTag tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTagRole userTagRole = (UserTagRole) o;
    return Objects.equals(role, userTagRole.role) &&
        Objects.equals(roleId, userTagRole.roleId) &&
        Objects.equals(tag, userTagRole.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, roleId, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTagRole {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
