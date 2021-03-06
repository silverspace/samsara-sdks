package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The authors signature for the DVIR.
 **/
@ApiModel(description="The authors signature for the DVIR.")
public class DvirBaseAuthorSignature  {
  
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.")
 /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver|mechanic who signed the DVIR.")
 /**
   * Email of the  driver|mechanic who signed the DVIR.
  **/
  private String email = null;

  @ApiModelProperty(example = "14849", value = "ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.")
 /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
  **/
  private Long mechanicUserId = null;

  @ApiModelProperty(example = "John Smith", value = "The name of the driver or mechanic who signed the DVIR.")
 /**
   * The name of the driver or mechanic who signed the DVIR.
  **/
  private String name = null;

  @ApiModelProperty(example = "12535500000", value = "The time in millis when the DVIR was signed")
 /**
   * The time in millis when the DVIR was signed
  **/
  private Long signedAt = null;

  @ApiModelProperty(example = "driver", value = "Type corresponds to whether the signature corresponds to driver|mechanic.")
 /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
  **/
  private String type = null;

  @ApiModelProperty(example = "jsmith", value = "Username of the  driver|mechanic who signed the DVIR.")
 /**
   * Username of the  driver|mechanic who signed the DVIR.
  **/
  private String username = null;
 /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DvirBaseAuthorSignature driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * Email of the  driver|mechanic who signed the DVIR.
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DvirBaseAuthorSignature email(String email) {
    this.email = email;
    return this;
  }

 /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   * @return mechanicUserId
  **/
  @JsonProperty("mechanicUserId")
  public Long getMechanicUserId() {
    return mechanicUserId;
  }

  public void setMechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
  }

  public DvirBaseAuthorSignature mechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
    return this;
  }

 /**
   * The name of the driver or mechanic who signed the DVIR.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseAuthorSignature name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The time in millis when the DVIR was signed
   * @return signedAt
  **/
  @JsonProperty("signedAt")
  public Long getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  public DvirBaseAuthorSignature signedAt(Long signedAt) {
    this.signedAt = signedAt;
    return this;
  }

 /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DvirBaseAuthorSignature type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Username of the  driver|mechanic who signed the DVIR.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DvirBaseAuthorSignature username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseAuthorSignature {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mechanicUserId: ").append(toIndentedString(mechanicUserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

