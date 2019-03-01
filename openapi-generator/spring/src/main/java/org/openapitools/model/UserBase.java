package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class UserBase   {
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

  public UserBase authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   * @return authType
  */
  @ApiModelProperty(required = true, value = "The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.")
  @NotNull


  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public UserBase email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of this user.
   * @return email
  */
  @ApiModelProperty(example = "user@company.com", required = true, value = "The email address of this user.")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The first and last name of the user.
   * @return name
  */
  @ApiModelProperty(example = "Jane Doe", value = "The first and last name of the user.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserBase organizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
    return this;
  }

  /**
   * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
   * @return organizationRoleId
  */
  @ApiModelProperty(example = "23d4d8d3-dc10-4e7a-a183-69968751f23e", value = "The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.")


  public String getOrganizationRoleId() {
    return organizationRoleId;
  }

  public void setOrganizationRoleId(String organizationRoleId) {
    this.organizationRoleId = organizationRoleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBase userBase = (UserBase) o;
    return Objects.equals(this.authType, userBase.authType) &&
        Objects.equals(this.email, userBase.email) &&
        Objects.equals(this.name, userBase.name) &&
        Objects.equals(this.organizationRoleId, userBase.organizationRoleId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

