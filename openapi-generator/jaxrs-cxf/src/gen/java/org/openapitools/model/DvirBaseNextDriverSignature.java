package org.openapitools.model;

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
  * The next driver signature for the DVIR.
 **/
@ApiModel(description="The next driver signature for the DVIR.")
public class DvirBaseNextDriverSignature  {
  
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR")
 /**
   * ID of the driver who signed the DVIR
  **/
  private Long driverId;

  @ApiModelProperty(example = "John Smith", value = "The name of the driver who signed the next DVIR on this vehicle.")
 /**
   * The name of the driver who signed the next DVIR on this vehicle.
  **/
  private String name;

  @ApiModelProperty(example = "12535500000", value = "The time in millis when the next driver signed the DVIR on this vehicle.")
 /**
   * The time in millis when the next driver signed the DVIR on this vehicle.
  **/
  private Long signedAt;

  @ApiModelProperty(example = "driver", value = "Type corresponds to driver.")
 /**
   * Type corresponds to driver.
  **/
  private String type;

  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver who signed the next DVIR on this vehicle.")
 /**
   * Email of the  driver who signed the next DVIR on this vehicle.
  **/
  private String email;

  @ApiModelProperty(example = "jsmith", value = "Username of the  driver who signed the next DVIR on this vehicle.")
 /**
   * Username of the  driver who signed the next DVIR on this vehicle.
  **/
  private String username;
 /**
   * ID of the driver who signed the DVIR
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DvirBaseNextDriverSignature driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * The name of the driver who signed the next DVIR on this vehicle.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseNextDriverSignature name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The time in millis when the next driver signed the DVIR on this vehicle.
   * @return signedAt
  **/
  @JsonProperty("signedAt")
  public Long getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  public DvirBaseNextDriverSignature signedAt(Long signedAt) {
    this.signedAt = signedAt;
    return this;
  }

 /**
   * Type corresponds to driver.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DvirBaseNextDriverSignature type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Email of the  driver who signed the next DVIR on this vehicle.
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DvirBaseNextDriverSignature email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Username of the  driver who signed the next DVIR on this vehicle.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DvirBaseNextDriverSignature username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseNextDriverSignature {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

