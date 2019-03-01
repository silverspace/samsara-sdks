package org.openapitools.model;

import org.openapitools.model.UserTagRoleTag;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserTagRole  {
  
  @ApiModelProperty(example = "Full Admin", value = "The name of the role the user has been granted on this tag.")
 /**
   * The name of the role the user has been granted on this tag.
  **/
  private String role;

  @ApiModelProperty(example = "8a9371af-82d1-4158-bf91-4ecc8d3a114c", required = true, value = "The id of the role the user has been granted on this tag.")
 /**
   * The id of the role the user has been granted on this tag.
  **/
  private String roleId;

  @ApiModelProperty(required = true, value = "")
  private UserTagRoleTag tag = null;
 /**
   * The name of the role the user has been granted on this tag.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserTagRole role(String role) {
    this.role = role;
    return this;
  }

 /**
   * The id of the role the user has been granted on this tag.
   * @return roleId
  **/
  @JsonProperty("roleId")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public UserTagRole roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

 /**
   * Get tag
   * @return tag
  **/
  @JsonProperty("tag")
  public UserTagRoleTag getTag() {
    return tag;
  }

  public void setTag(UserTagRoleTag tag) {
    this.tag = tag;
  }

  public UserTagRole tag(UserTagRoleTag tag) {
    this.tag = tag;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

