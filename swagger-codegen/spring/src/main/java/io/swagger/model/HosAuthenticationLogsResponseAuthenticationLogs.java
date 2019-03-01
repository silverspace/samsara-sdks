package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HosAuthenticationLogsResponseAuthenticationLogs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class HosAuthenticationLogsResponseAuthenticationLogs   {
  @JsonProperty("actionType")
  private String actionType = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("addressName")
  private String addressName = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("happenedAtMs")
  private Long happenedAtMs = null;

  @JsonProperty("state")
  private String state = null;

  public HosAuthenticationLogsResponseAuthenticationLogs actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * The log type - one of 'signin' or 'signout'
   * @return actionType
  **/
  @ApiModelProperty(example = "signin", value = "The log type - one of 'signin' or 'signout'")


  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address at which the log was recorded, if applicable.
   * @return address
  **/
  @ApiModelProperty(example = "123 Main St., Ahwatukee, Arizona 85044", value = "Address at which the log was recorded, if applicable.")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

  /**
   * Address name from the group address book at which the log was recorded, if applicable.
   * @return addressName
  **/
  @ApiModelProperty(example = "Garage Number 3", value = "Address name from the group address book at which the log was recorded, if applicable.")


  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City in which the log was recorded, if applicable.
   * @return city
  **/
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded, if applicable.")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs happenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
    return this;
  }

  /**
   * The time at which the event was recorded in UNIX milliseconds.
   * @return happenedAtMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the event was recorded in UNIX milliseconds.")


  public Long getHappenedAtMs() {
    return happenedAtMs;
  }

  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State in which the log was recorded, if applicable.
   * @return state
  **/
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded, if applicable.")


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
    return Objects.equals(this.actionType, hosAuthenticationLogsResponseAuthenticationLogs.actionType) &&
        Objects.equals(this.address, hosAuthenticationLogsResponseAuthenticationLogs.address) &&
        Objects.equals(this.addressName, hosAuthenticationLogsResponseAuthenticationLogs.addressName) &&
        Objects.equals(this.city, hosAuthenticationLogsResponseAuthenticationLogs.city) &&
        Objects.equals(this.happenedAtMs, hosAuthenticationLogsResponseAuthenticationLogs.happenedAtMs) &&
        Objects.equals(this.state, hosAuthenticationLogsResponseAuthenticationLogs.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, address, addressName, city, happenedAtMs, state);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

