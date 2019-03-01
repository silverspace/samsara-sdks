package io.swagger.model;

import io.swagger.model.UserBase;
import io.swagger.model.UserTagRole;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User  {
  

@XmlType(name="AuthTypeEnum")
@XmlEnum(String.class)
public enum AuthTypeEnum {

@XmlEnumValue("default") DEFAULT(String.valueOf("default")), @XmlEnumValue("saml") SAML(String.valueOf("saml"));


    private String value;

    AuthTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String v) {
        for (AuthTypeEnum b : AuthTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.")
 /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  **/
  private AuthTypeEnum authType = null;

  @ApiModelProperty(example = "user@company.com", required = true, value = "The email address of this user.")
 /**
   * The email address of this user.
  **/
  private String email = null;

  @ApiModelProperty(example = "Jane Doe", value = "The first and last name of the user.")
 /**
   * The first and last name of the user.
  **/
  private String name = null;

  @ApiModelProperty(example = "23d4d8d3-dc10-4e7a-a183-69968751f23e", value = "The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")
 /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  **/
  private String organizationRoleId = null;

  @ApiModelProperty(example = "123", value = "The ID of the User record.")
 /**
   * The ID of the User record.
  **/
  private Long id = null;

  @ApiModelProperty(example = "Full Admin", value = "The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")
 /**
   * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  **/
  private String organizationRole = null;

  @ApiModelProperty(value = "The specific tags this user has access to. This will be blank for users that have full access to the organization.")
  @Valid
 /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
  **/
  private List<UserTagRole> tagRoles = null;
 /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   * @return authType
  **/
  @JsonProperty("authType")
  @NotNull
  public String getAuthType() {
    if (authType == null) {
      return null;
    }
    return authType.value();
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public User authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

 /**
   * The email address of this user.
   * @return email
  **/
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

 /**
   * The first and last name of the user.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   * @return organizationRoleId
  **/
  @JsonProperty("organizationRoleId")
  public String getOrganizationRoleId() {
    return organizationRoleId;
  }

  public void setOrganizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
  }

  public User organizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
    return this;
  }

 /**
   * The ID of the User record.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   * @return organizationRole
  **/
  @JsonProperty("organizationRole")
  public String getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
  }

  public User organizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

 /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
   * @return tagRoles
  **/
  @JsonProperty("tagRoles")
  public List<UserTagRole> getTagRoles() {
    return tagRoles;
  }

  public void setTagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
  }

  public User tagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
    return this;
  }

  public User addTagRolesItem(UserTagRole tagRolesItem) {
    this.tagRoles.add(tagRolesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationRoleId: ").append(toIndentedString(organizationRoleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    tagRoles: ").append(toIndentedString(tagRoles)).append("\n");
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

