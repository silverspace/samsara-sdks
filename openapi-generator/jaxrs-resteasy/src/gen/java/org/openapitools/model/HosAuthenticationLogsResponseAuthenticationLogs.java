package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class HosAuthenticationLogsResponseAuthenticationLogs   {
  
  private String actionType;
  private String address;
  private String city;
  private Long happenedAtMs;
  private String addressName;
  private String state;

  /**
   * The log type - one of &#39;signin&#39; or &#39;signout&#39;
   **/
  
  @ApiModelProperty(example = "signin", value = "The log type - one of 'signin' or 'signout'")
  @JsonProperty("actionType")
  public String getActionType() {
    return actionType;
  }
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  /**
   * Address at which the log was recorded, if applicable.
   **/
  
  @ApiModelProperty(example = "123 Main St., Ahwatukee, Arizona 85044", value = "Address at which the log was recorded, if applicable.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * City in which the log was recorded, if applicable.
   **/
  
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded, if applicable.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The time at which the event was recorded in UNIX milliseconds.
   **/
  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the event was recorded in UNIX milliseconds.")
  @JsonProperty("happenedAtMs")
  public Long getHappenedAtMs() {
    return happenedAtMs;
  }
  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

  /**
   * Address name from the group address book at which the log was recorded, if applicable.
   **/
  
  @ApiModelProperty(example = "Garage Number 3", value = "Address name from the group address book at which the log was recorded, if applicable.")
  @JsonProperty("addressName")
  public String getAddressName() {
    return addressName;
  }
  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  /**
   * State in which the log was recorded, if applicable.
   **/
  
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded, if applicable.")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

