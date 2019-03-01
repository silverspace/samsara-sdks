package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserTagRoleTag;

/**
 * UserTagRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
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
  @ApiModelProperty(example = "Full Admin", value = "The name of the role the user has been granted on this tag.")
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
  @ApiModelProperty(example = "8a9371af-82d1-4158-bf91-4ecc8d3a114c", required = true, value = "The id of the role the user has been granted on this tag.")
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
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.role, userTagRole.role) &&
        Objects.equals(this.roleId, userTagRole.roleId) &&
        Objects.equals(this.tag, userTagRole.tag);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

