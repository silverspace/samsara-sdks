package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UserBase   {
  

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

  private AuthTypeEnum authType = null;
  private String email = null;
  private String name = null;
  private String organizationRoleId = null;

  /**
   * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
   **/
  public UserBase authType(AuthTypeEnum authType) {
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
  public UserBase email(String email) {
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
  public UserBase name(String name) {
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
  public UserBase organizationRoleId(String organizationRoleId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

