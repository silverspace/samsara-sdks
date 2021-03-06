package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The mechanic&#39;s or agent&#39;s signature for the DVIR.
 **/
@ApiModel(description = "The mechanic's or agent's signature for the DVIR.")
public class DvirBaseMechanicOrAgentSignature   {
  
  private @Valid Long mechanicUserId;
  private @Valid Long driverId;
  private @Valid String name;
  private @Valid Long signedAt;
  private @Valid String type;
  private @Valid String email;
  private @Valid String username;

  /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   **/
  public DvirBaseMechanicOrAgentSignature mechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
    return this;
  }

  
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
  public DvirBaseMechanicOrAgentSignature driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The name of the agent or mechanic who signed the DVIR.
   **/
  public DvirBaseMechanicOrAgentSignature name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "John Smith", value = "The name of the agent or mechanic who signed the DVIR.")
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
  public DvirBaseMechanicOrAgentSignature signedAt(Long signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  
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
  public DvirBaseMechanicOrAgentSignature type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "driver", value = "Type corresponds to whether the signature corresponds to driver|mechanic.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Email of the  agent|mechanic who signed the DVIR.
   **/
  public DvirBaseMechanicOrAgentSignature email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  agent|mechanic who signed the DVIR.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Username of the  agent|mechanic who signed the DVIR.
   **/
  public DvirBaseMechanicOrAgentSignature username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "jsmith", value = "Username of the  agent|mechanic who signed the DVIR.")
  @JsonProperty("username")
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
    DvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature = (DvirBaseMechanicOrAgentSignature) o;
    return Objects.equals(mechanicUserId, dvirBaseMechanicOrAgentSignature.mechanicUserId) &&
        Objects.equals(driverId, dvirBaseMechanicOrAgentSignature.driverId) &&
        Objects.equals(name, dvirBaseMechanicOrAgentSignature.name) &&
        Objects.equals(signedAt, dvirBaseMechanicOrAgentSignature.signedAt) &&
        Objects.equals(type, dvirBaseMechanicOrAgentSignature.type) &&
        Objects.equals(email, dvirBaseMechanicOrAgentSignature.email) &&
        Objects.equals(username, dvirBaseMechanicOrAgentSignature.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanicUserId, driverId, name, signedAt, type, email, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseMechanicOrAgentSignature {\n");
    
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

