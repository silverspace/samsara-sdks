package apimodels;

import apimodels.UserTagRoleTag;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * UserTagRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserTagRole   {
  @JsonProperty("role")
  private String role;

  @JsonProperty("roleId")
  private String roleId;

  @JsonProperty("tag")
  private UserTagRoleTag tag = null;

  public UserTagRole role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The name of the role the user has been granted on this tag.
   * @return role
  **/
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserTagRole roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * The id of the role the user has been granted on this tag.
   * @return roleId
  **/
  @NotNull
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public UserTagRole tag(UserTagRoleTag tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @NotNull
@Valid
  public UserTagRoleTag getTag() {
    return tag;
  }

  public void setTag(UserTagRoleTag tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

