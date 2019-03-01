package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserBase;
import io.swagger.model.UserTagRole;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

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

    @JsonCreator
    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("authType")
  private AuthTypeEnum authType = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organizationRoleId")
  private String organizationRoleId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("organizationRole")
  private String organizationRole = null;

  @JsonProperty("tagRoles")
  @Valid
  private List<UserTagRole> tagRoles = null;

  public User authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.")
  @NotNull


  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of this user.
   * @return email
  **/
  @ApiModelProperty(example = "user@company.com", required = true, value = "The email address of this user.")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The first and last name of the user.
   * @return name
  **/
  @ApiModelProperty(example = "Jane Doe", value = "The first and last name of the user.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User organizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
    return this;
  }

  /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   * @return organizationRoleId
  **/
  @ApiModelProperty(example = "23d4d8d3-dc10-4e7a-a183-69968751f23e", value = "The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")


  public String getOrganizationRoleId() {
    return organizationRoleId;
  }

  public void setOrganizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the User record.
   * @return id
  **/
  @ApiModelProperty(example = "123", value = "The ID of the User record.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User organizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

  /**
   * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   * @return organizationRole
  **/
  @ApiModelProperty(example = "Full Admin", value = "The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")


  public String getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
  }

  public User tagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
    return this;
  }

  public User addTagRolesItem(UserTagRole tagRolesItem) {
    if (this.tagRoles == null) {
      this.tagRoles = new ArrayList<UserTagRole>();
    }
    this.tagRoles.add(tagRolesItem);
    return this;
  }

  /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
   * @return tagRoles
  **/
  @ApiModelProperty(value = "The specific tags this user has access to. This will be blank for users that have full access to the organization.")

  @Valid

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
    return Objects.equals(this.authType, user.authType) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.organizationRoleId, user.organizationRoleId) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.organizationRole, user.organizationRole) &&
        Objects.equals(this.tagRoles, user.tagRoles);
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

