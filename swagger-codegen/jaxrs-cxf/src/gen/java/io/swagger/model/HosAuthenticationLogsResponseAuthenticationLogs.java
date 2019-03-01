package io.swagger.model;

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

public class HosAuthenticationLogsResponseAuthenticationLogs  {
  
  @ApiModelProperty(example = "signin", value = "The log type - one of 'signin' or 'signout'")
 /**
   * The log type - one of 'signin' or 'signout'
  **/
  private String actionType = null;

  @ApiModelProperty(example = "123 Main St., Ahwatukee, Arizona 85044", value = "Address at which the log was recorded, if applicable.")
 /**
   * Address at which the log was recorded, if applicable.
  **/
  private String address = null;

  @ApiModelProperty(example = "Garage Number 3", value = "Address name from the group address book at which the log was recorded, if applicable.")
 /**
   * Address name from the group address book at which the log was recorded, if applicable.
  **/
  private String addressName = null;

  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded, if applicable.")
 /**
   * City in which the log was recorded, if applicable.
  **/
  private String city = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the event was recorded in UNIX milliseconds.")
 /**
   * The time at which the event was recorded in UNIX milliseconds.
  **/
  private Long happenedAtMs = null;

  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded, if applicable.")
 /**
   * State in which the log was recorded, if applicable.
  **/
  private String state = null;
 /**
   * The log type - one of &#39;signin&#39; or &#39;signout&#39;
   * @return actionType
  **/
  @JsonProperty("actionType")
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

 /**
   * Address at which the log was recorded, if applicable.
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Address name from the group address book at which the log was recorded, if applicable.
   * @return addressName
  **/
  @JsonProperty("addressName")
  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

 /**
   * City in which the log was recorded, if applicable.
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs city(String city) {
    this.city = city;
    return this;
  }

 /**
   * The time at which the event was recorded in UNIX milliseconds.
   * @return happenedAtMs
  **/
  @JsonProperty("happenedAtMs")
  public Long getHappenedAtMs() {
    return happenedAtMs;
  }

  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs happenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
    return this;
  }

 /**
   * State in which the log was recorded, if applicable.
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs state(String state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosAuthenticationLogsResponseAuthenticationLogs {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    happenedAtMs: ").append(toIndentedString(happenedAtMs)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

