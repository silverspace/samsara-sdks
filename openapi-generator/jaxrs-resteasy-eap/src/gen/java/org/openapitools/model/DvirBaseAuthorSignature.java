package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The authors signature for the DVIR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class DvirBaseAuthorSignature   {
  

  private Long mechanicUserId;

  private Long driverId;

  private String name;

  private Long signedAt;

  private String type;

  private String email;

  private String username;

  /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   **/
  
  @ApiModelProperty(example = "14849", value = "ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.")
  @JsonProperty("mechanicUserId")
  public Long getMechanicUserId() {
    return mechanicUserId;
  }
  public void setMechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
  }

  /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   **/
  
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The name of the driver or mechanic who signed the DVIR.
   **/
  
  @ApiModelProperty(example = "John Smith", value = "The name of the driver or mechanic who signed the DVIR.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The time in millis when the DVIR was signed
   **/
  
  @ApiModelProperty(example = "12535500000", value = "The time in millis when the DVIR was signed")
  @JsonProperty("signedAt")
  public Long getSignedAt() {
    return signedAt;
  }
  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   **/
  
  @ApiModelProperty(example = "driver", value = "Type corresponds to whether the signature corresponds to driver|mechanic.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Email of the  driver|mechanic who signed the DVIR.
   **/
  
  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver|mechanic who signed the DVIR.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Username of the  driver|mechanic who signed the DVIR.
   **/
  
  @ApiModelProperty(example = "jsmith", value = "Username of the  driver|mechanic who signed the DVIR.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseAuthorSignature dvirBaseAuthorSignature = (DvirBaseAuthorSignature) o;
    return Objects.equals(mechanicUserId, dvirBaseAuthorSignature.mechanicUserId) &&
        Objects.equals(driverId, dvirBaseAuthorSignature.driverId) &&
        Objects.equals(name, dvirBaseAuthorSignature.name) &&
        Objects.equals(signedAt, dvirBaseAuthorSignature.signedAt) &&
        Objects.equals(type, dvirBaseAuthorSignature.type) &&
        Objects.equals(email, dvirBaseAuthorSignature.email) &&
        Objects.equals(username, dvirBaseAuthorSignature.username);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

