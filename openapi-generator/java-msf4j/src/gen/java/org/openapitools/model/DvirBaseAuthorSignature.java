package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The authors signature for the DVIR.
 */
@ApiModel(description = "The authors signature for the DVIR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class DvirBaseAuthorSignature   {
  @JsonProperty("mechanicUserId")
  private Long mechanicUserId;

  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("signedAt")
  private Long signedAt;

  @JsonProperty("type")
  private String type;

  @JsonProperty("email")
  private String email;

  @JsonProperty("username")
  private String username;

  public DvirBaseAuthorSignature mechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
    return this;
  }

   /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   * @return mechanicUserId
  **/
  @ApiModelProperty(example = "14849", value = "ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.")
  public Long getMechanicUserId() {
    return mechanicUserId;
  }

  public void setMechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
  }

  public DvirBaseAuthorSignature driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   * @return driverId
  **/
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DvirBaseAuthorSignature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the driver or mechanic who signed the DVIR.
   * @return name
  **/
  @ApiModelProperty(example = "John Smith", value = "The name of the driver or mechanic who signed the DVIR.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseAuthorSignature signedAt(Long signedAt) {
    this.signedAt = signedAt;
    return this;
  }

   /**
   * The time in millis when the DVIR was signed
   * @return signedAt
  **/
  @ApiModelProperty(example = "12535500000", value = "The time in millis when the DVIR was signed")
  public Long getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  public DvirBaseAuthorSignature type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   * @return type
  **/
  @ApiModelProperty(example = "driver", value = "Type corresponds to whether the signature corresponds to driver|mechanic.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DvirBaseAuthorSignature email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the  driver|mechanic who signed the DVIR.
   * @return email
  **/
  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver|mechanic who signed the DVIR.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DvirBaseAuthorSignature username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the  driver|mechanic who signed the DVIR.
   * @return username
  **/
  @ApiModelProperty(example = "jsmith", value = "Username of the  driver|mechanic who signed the DVIR.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseAuthorSignature dvirBaseAuthorSignature = (DvirBaseAuthorSignature) o;
    return Objects.equals(this.mechanicUserId, dvirBaseAuthorSignature.mechanicUserId) &&
        Objects.equals(this.driverId, dvirBaseAuthorSignature.driverId) &&
        Objects.equals(this.name, dvirBaseAuthorSignature.name) &&
        Objects.equals(this.signedAt, dvirBaseAuthorSignature.signedAt) &&
        Objects.equals(this.type, dvirBaseAuthorSignature.type) &&
        Objects.equals(this.email, dvirBaseAuthorSignature.email) &&
        Objects.equals(this.username, dvirBaseAuthorSignature.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanicUserId, driverId, name, signedAt, type, email, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseAuthorSignature {\n");
    
    sb.append("    mechanicUserId: ").append(toIndentedString(mechanicUserId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

