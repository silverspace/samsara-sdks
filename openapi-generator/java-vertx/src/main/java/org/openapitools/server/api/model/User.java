package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.UserBase;
import org.openapitools.server.api.model.UserTagRole;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class User   {
  


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
      return value;
    }
  }

  private AuthTypeEnum authType;
  private String email;
  private String name;
  private String organizationRoleId;
  private Long id;
  private String organizationRole;
  private List<UserTagRole> tagRoles = new ArrayList<>();

  public User () {

  }

  public User (AuthTypeEnum authType, String email, String name, String organizationRoleId, Long id, String organizationRole, List<UserTagRole> tagRoles) {
    this.authType = authType;
    this.email = email;
    this.name = name;
    this.organizationRoleId = organizationRoleId;
    this.id = id;
    this.organizationRole = organizationRole;
    this.tagRoles = tagRoles;
  }

    
  @JsonProperty("authType")
  public AuthTypeEnum getAuthType() {
    return authType;
  }
  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("organizationRoleId")
  public String getOrganizationRoleId() {
    return organizationRoleId;
  }
  public void setOrganizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("organizationRole")
  public String getOrganizationRole() {
    return organizationRole;
  }
  public void setOrganizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
  }

    
  @JsonProperty("tagRoles")
  public List<UserTagRole> getTagRoles() {
    return tagRoles;
  }
  public void setTagRoles(List<UserTagRole> tagRoles) {
    this.tagRoles = tagRoles;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
