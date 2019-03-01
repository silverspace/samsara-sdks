package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The mechanic&#39;s or agent&#39;s signature for the DVIR.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DvirBaseMechanicOrAgentSignature   {
  
  private Long mechanicUserId;
  private Long driverId;
  private String name;
  private Long signedAt;
  private String type;
  private String email;
  private String username;

  public DvirBaseMechanicOrAgentSignature () {

  }

  public DvirBaseMechanicOrAgentSignature (Long mechanicUserId, Long driverId, String name, Long signedAt, String type, String email, String username) {
    this.mechanicUserId = mechanicUserId;
    this.driverId = driverId;
    this.name = name;
    this.signedAt = signedAt;
    this.type = type;
    this.email = email;
    this.username = username;
  }

    
  @JsonProperty("mechanicUserId")
  public Long getMechanicUserId() {
    return mechanicUserId;
  }
  public void setMechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
