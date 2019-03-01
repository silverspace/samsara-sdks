package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserBase;
import org.openapitools.model.UserTagRole;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class User   {
  

@XmlType(name="AuthTypeEnum")
@XmlEnum(String.class)
public enum AuthTypeEnum {

    @XmlEnumValue("default") DEFAULT(String.valueOf("default")), @XmlEnumValue("saml") SAML(String.valueOf("saml"));


    private String value;

    AuthTypeEnum(String v) {
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
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private AuthTypeEnum authType;

  private String email;

  private String name;

  private String organizationRoleId;

  private Long id;

  private String organizationRole;

  private List<UserTagRole> tagRoles = null;


  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   **/
  public User authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.")
  @JsonProperty("authType")
  @NotNull
  public AuthTypeEnum getAuthType() {
    return authType;
  }
  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  /**
   * The email address of this user.
   **/
  public User email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "user@company.com", required = true, value = "The email address of this user.")
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * The first and last name of the user.
   **/
  public User name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Jane Doe", value = "The first and last name of the user.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   **/
  public User organizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
    return this;
  }

  
  @ApiModelProperty(example = "23d4d8d3-dc10-4e7a-a183-69968751f23e", value = "The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")
  @JsonProperty("organizationRoleId")
  public String getOrganizationRoleId() {
    return organizationRoleId;
  }
  public void setOrganizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
  }


  /**
   * The ID of the User record.
   **/
  public User id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "123", value = "The ID of the User record.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   **/
  public User organizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

  
  @ApiModelProperty(example = "Full Admin", value = "The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")
  @JsonProperty("organizationRole")
  public String getOrganizationRole() {
    return organizationRole;
  }
  public void setOrganizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
  }


  /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
   **/
  public User tagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
    return this;
  }

  
  @ApiModelProperty(value = "The specific tags this user has access to. This will be blank for users that have full access to the organization.")
  @JsonProperty("tagRoles")
  public List<UserTagRole> getTagRoles() {
    return tagRoles;
  }
  public void setTagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
  }

  public User addTagRolesItem(UserTagRole tagRolesItem) {
    if (this.tagRoles == null) {
      this.tagRoles = new ArrayList<UserTagRole>();
    }
    this.tagRoles.add(tagRolesItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(authType, user.authType) &&
        Objects.equals(email, user.email) &&
        Objects.equals(name, user.name) &&
        Objects.equals(organizationRoleId, user.organizationRoleId) &&
        Objects.equals(id, user.id) &&
        Objects.equals(organizationRole, user.organizationRole) &&
        Objects.equals(tagRoles, user.tagRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, email, name, organizationRoleId, id, organizationRole, tagRoles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

