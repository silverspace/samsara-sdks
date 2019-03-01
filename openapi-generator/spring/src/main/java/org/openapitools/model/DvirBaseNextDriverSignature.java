package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The next driver signature for the DVIR.
 */
@ApiModel(description = "The next driver signature for the DVIR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DvirBaseNextDriverSignature   {
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

  public DvirBaseNextDriverSignature driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver who signed the DVIR
   * @return driverId
  */
  @ApiModelProperty(example = "2581", value = "ID of the driver who signed the DVIR")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DvirBaseNextDriverSignature name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the driver who signed the next DVIR on this vehicle.
   * @return name
  */
  @ApiModelProperty(example = "John Smith", value = "The name of the driver who signed the next DVIR on this vehicle.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvirBaseNextDriverSignature signedAt(Long signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * The time in millis when the next driver signed the DVIR on this vehicle.
   * @return signedAt
  */
  @ApiModelProperty(example = "12535500000", value = "The time in millis when the next driver signed the DVIR on this vehicle.")


  public Long getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  public DvirBaseNextDriverSignature type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type corresponds to driver.
   * @return type
  */
  @ApiModelProperty(example = "driver", value = "Type corresponds to driver.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DvirBaseNextDriverSignature email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the  driver who signed the next DVIR on this vehicle.
   * @return email
  */
  @ApiModelProperty(example = "j.smith@yahoo.com", value = "Email of the  driver who signed the next DVIR on this vehicle.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DvirBaseNextDriverSignature username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the  driver who signed the next DVIR on this vehicle.
   * @return username
  */
  @ApiModelProperty(example = "jsmith", value = "Username of the  driver who signed the next DVIR on this vehicle.")


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
    DvirBaseNextDriverSignature dvirBaseNextDriverSignature = (DvirBaseNextDriverSignature) o;
    return Objects.equals(this.driverId, dvirBaseNextDriverSignature.driverId) &&
        Objects.equals(this.name, dvirBaseNextDriverSignature.name) &&
        Objects.equals(this.signedAt, dvirBaseNextDriverSignature.signedAt) &&
        Objects.equals(this.type, dvirBaseNextDriverSignature.type) &&
        Objects.equals(this.email, dvirBaseNextDriverSignature.email) &&
        Objects.equals(this.username, dvirBaseNextDriverSignature.username);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

