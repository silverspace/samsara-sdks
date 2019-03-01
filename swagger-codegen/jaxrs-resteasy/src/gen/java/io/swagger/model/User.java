package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.UserBase;
import io.swagger.model.UserTagRole;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class User   {
  

  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   */
  public enum AuthTypeEnum {
    DEFAULT("default"),

        SAML("saml");
    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AuthTypeEnum authType = null;
  private String email = null;
  private String name = null;
  private String organizationRoleId = null;
  private Long id = null;
  private String organizationRole = null;
  private List<UserTagRole> tagRoles = new ArrayList<UserTagRole>();

  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   **/
  
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
  
  @ApiModelProperty(value = "The specific tags this user has access to. This will be blank for users that have full access to the organization.")
  @JsonProperty("tagRoles")
  public List<UserTagRole> getTagRoles() {
    return tagRoles;
  }
  public void setTagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
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

