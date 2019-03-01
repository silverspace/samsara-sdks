package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class UserBase   {
  


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

  public UserBase () {

  }

  public UserBase (AuthTypeEnum authType, String email, String name, String organizationRoleId) {
    this.authType = authType;
    this.email = email;
    this.name = name;
    this.organizationRoleId = organizationRoleId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBase userBase = (UserBase) o;
    return Objects.equals(authType, userBase.authType) &&
        Objects.equals(email, userBase.email) &&
        Objects.equals(name, userBase.name) &&
        Objects.equals(organizationRoleId, userBase.organizationRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, email, name, organizationRoleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBase {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationRoleId: ").append(toIndentedString(organizationRoleId)).append("\n");
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
