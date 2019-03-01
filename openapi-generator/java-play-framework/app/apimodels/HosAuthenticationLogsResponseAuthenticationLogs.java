package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosAuthenticationLogsResponseAuthenticationLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosAuthenticationLogsResponseAuthenticationLogs   {
  @JsonProperty("actionType")
  private String actionType;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("happenedAtMs")
  private Long happenedAtMs;

  @JsonProperty("addressName")
  private String addressName;

  @JsonProperty("state")
  private String state;

  public HosAuthenticationLogsResponseAuthenticationLogs actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * The log type - one of 'signin' or 'signout'
   * @return actionType
  **/
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
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City in which the log was recorded, if applicable.
   * @return city
  **/
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
    public Long getHappenedAtMs() {
    return happenedAtMs;
  }

  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

   /**
   * Address name from the group address book at which the log was recorded, if applicable.
   * @return addressName
  **/
    public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State in which the log was recorded, if applicable.
   * @return state
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

