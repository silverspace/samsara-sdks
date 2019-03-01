package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HosAuthenticationLogsResponseAuthenticationLogs   {
  
  private String actionType;
  private String address;
  private String city;
  private Long happenedAtMs;
  private String addressName;
  private String state;

  public HosAuthenticationLogsResponseAuthenticationLogs () {

  }

  public HosAuthenticationLogsResponseAuthenticationLogs (String actionType, String address, String city, Long happenedAtMs, String addressName, String state) {
    this.actionType = actionType;
    this.address = address;
    this.city = city;
    this.happenedAtMs = happenedAtMs;
    this.addressName = addressName;
    this.state = state;
  }

    
  @JsonProperty("actionType")
  public String getActionType() {
    return actionType;
  }
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

    
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

    
  @JsonProperty("happenedAtMs")
  public Long getHappenedAtMs() {
    return happenedAtMs;
  }
  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

    
  @JsonProperty("addressName")
  public String getAddressName() {
    return addressName;
  }
  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

    
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosAuthenticationLogsResponseAuthenticationLogs hosAuthenticationLogsResponseAuthenticationLogs = (HosAuthenticationLogsResponseAuthenticationLogs) o;
    return Objects.equals(actionType, hosAuthenticationLogsResponseAuthenticationLogs.actionType) &&
        Objects.equals(address, hosAuthenticationLogsResponseAuthenticationLogs.address) &&
        Objects.equals(city, hosAuthenticationLogsResponseAuthenticationLogs.city) &&
        Objects.equals(happenedAtMs, hosAuthenticationLogsResponseAuthenticationLogs.happenedAtMs) &&
        Objects.equals(addressName, hosAuthenticationLogsResponseAuthenticationLogs.addressName) &&
        Objects.equals(state, hosAuthenticationLogsResponseAuthenticationLogs.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, address, city, happenedAtMs, addressName, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosAuthenticationLogsResponseAuthenticationLogs {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    happenedAtMs: ").append(toIndentedString(happenedAtMs)).append("\n");
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
