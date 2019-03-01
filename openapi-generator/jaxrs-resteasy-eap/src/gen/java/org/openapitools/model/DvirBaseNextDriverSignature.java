package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The next driver signature for the DVIR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class DvirBaseNextDriverSignature   {
  

  private Long driverId;

  private String name;

  private Long signedAt;

  private String type;

  private String email;

  private String username;

  /**
   * ID of the driver who signed the DVIR
   **/
  
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The name of the driver who signed the next DVIR on this vehicle.
   **/
  
  @ApiModelProperty(example = "John Smith", value = "The name of the driver who signed the next DVIR on this vehicle.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The time in millis when the next driver signed the DVIR on this vehicle.
   **/
  
  @ApiModelProperty(example = "12535500000", value = "The time in millis when the next driver signed the DVIR on this vehicle.")
  @JsonProperty("signedAt")
  public Long getSignedAt() {
    return signedAt;
  }
  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  /**
   * Type corresponds to driver.
   **/
  
  @ApiModelProperty(example = "driver", value = "Type corresponds to driver.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Email of the  driver who signed the next DVIR on this vehicle.
   **/
  
  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver who signed the next DVIR on this vehicle.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Username of the  driver who signed the next DVIR on this vehicle.
   **/
  
  @ApiModelProperty(example = "jsmith", value = "Username of the  driver who signed the next DVIR on this vehicle.")
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
    DvirBaseNextDriverSignature dvirBaseNextDriverSignature = (DvirBaseNextDriverSignature) o;
    return Objects.equals(driverId, dvirBaseNextDriverSignature.driverId) &&
        Objects.equals(name, dvirBaseNextDriverSignature.name) &&
        Objects.equals(signedAt, dvirBaseNextDriverSignature.signedAt) &&
        Objects.equals(type, dvirBaseNextDriverSignature.type) &&
        Objects.equals(email, dvirBaseNextDriverSignature.email) &&
        Objects.equals(username, dvirBaseNextDriverSignature.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, name, signedAt, type, email, username);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

