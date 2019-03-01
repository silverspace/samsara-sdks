package apimodels;

import apimodels.UserBase;
import apimodels.UserTagRole;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class User   {
  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   */
  public enum AuthTypeEnum {
    DEFAULT("default"),
    
    SAML("saml");

    private final String value;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("authType")
  private AuthTypeEnum authType;

  @JsonProperty("email")
  private String email;

  @JsonProperty("name")
  private String name;

  @JsonProperty("organizationRoleId")
  private String organizationRoleId;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("organizationRole")
  private String organizationRole;

  @JsonProperty("tagRoles")
  private List<UserTagRole> tagRoles = null;

  public User authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   * @return authType
  **/
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
    if (tagRoles == null) {
      tagRoles = new ArrayList<>();
    }
    tagRoles.add(tagRolesItem);
    return this;
  }

   /**
   * The specific tags this user has access to. This will be blank for users that have full access to the organization.
   * @return tagRoles
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

