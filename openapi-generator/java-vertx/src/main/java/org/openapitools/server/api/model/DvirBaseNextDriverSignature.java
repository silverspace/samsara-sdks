package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The next driver signature for the DVIR.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DvirBaseNextDriverSignature   {
  
  private Long driverId;
  private String name;
  private Long signedAt;
  private String type;
  private String email;
  private String username;

  public DvirBaseNextDriverSignature () {

  }

  public DvirBaseNextDriverSignature (Long driverId, String name, Long signedAt, String type, String email, String username) {
    this.driverId = driverId;
    this.name = name;
    this.signedAt = signedAt;
    this.type = type;
    this.email = email;
    this.username = username;
  }

    
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("signedAt")
  public Long getSignedAt() {
    return signedAt;
  }
  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
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
